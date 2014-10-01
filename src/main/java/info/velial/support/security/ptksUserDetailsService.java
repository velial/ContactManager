package info.velial.support.security;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by velial on 01.10.14.
 */
public class ptksUserDetailsService implements UserDetailsService {
    private static final Logger log = Logger.getLogger(String.valueOf(ptksUserDetailsService.class));

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException {
        Session session = null;
        try {
            log.info("loadUserByUsername("+login+")");
            List user = sessionFactory.getCurrentSession()
                    .createSQLQuery("select login,password,active from jwcms.users where login= ? ")
                    .setString(0, login)
                    .list();

            if (user.isEmpty())
            {
                throw new UsernameNotFoundException("Login " + login + " doesn't exist!");
            }

            String username = "";
            String password = "";
            Integer act = 0;
            for (Object listelement : user) {

                Object[] objectarray = (Object[]) listelement;
                username = (String) objectarray[0];
                password = (String) objectarray[1];
                act = (Integer) objectarray[2];
            }

//            username = login;
//            password = "";
            Boolean active = false; if (act==1) { active = true; }
            Boolean expired = false; if (act==2) {expired = true; }

            GrantedAuthority auth = new GrantedAuthority() {
                private static final long serialVersionUID = 1L;

//                @Override
                public String getAuthority() {
                    return "ROLE_USER";
                }
            };

            Set set = new HashSet();
            set.add(new GrantedAuthorityImpl("ROLE_USER"));

            UserDetails userDetails = new User(username,password,active,!expired,true,true,set);

            return userDetails;

        } catch (Exception e) {
            log.info("Exeption while loadUseByUsername");
        };
        return null;
    }
}

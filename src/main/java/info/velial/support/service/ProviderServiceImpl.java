package info.velial.support.service;

import info.velial.support.dao.ProviderDAO;
import info.velial.support.domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderDAO providerDAO;

    @Transactional
    public List<Provider> providersList() {
        return providerDAO.providersList();
    }

    @Transactional
    public Provider getProviderById(Integer providerId) {
        return providerDAO.getProviderById(providerId);
    }
}

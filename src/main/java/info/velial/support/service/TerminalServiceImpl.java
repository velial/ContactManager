package info.velial.support.service;

import info.velial.support.dao.TerminalDAO;
import info.velial.support.domain.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalDAO terminalDAO;

    @Transactional
    public List<Terminal> terminalsList() {
        return terminalDAO.terminalList();
    }

    @Transactional
    public Terminal getTerminalById(Integer terminalId) {
        return terminalDAO.getTerminalById(terminalId);
    }
}

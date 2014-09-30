package info.velial.support.dao;

import info.velial.support.domain.Terminal;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
public interface TerminalDAO {

    public List<Terminal> terminalList();

    public Terminal getTerminalById(Integer terminalId);
}

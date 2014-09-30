package info.velial.support.service;

import info.velial.support.domain.Terminal;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
public interface TerminalService {
    public List<Terminal> terminalsList();

    public Terminal getTerminalById(Integer terminalId);
}

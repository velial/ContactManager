package info.velial.support.service;

import info.velial.support.domain.Provider;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
public interface ProviderService {

    public List<Provider> providersList();

    public Provider getProviderById(Integer providerId);
}

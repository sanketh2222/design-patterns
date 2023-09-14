package com.scaler.lld.design.assignments.prototype;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    private Map<ConfigurationType,Configuration> registry = new HashMap<>();

    @Override
    public void addPrototype(Configuration user) {
        registry.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration configuration = registry.get(type);
        if (configuration != null) {
            return configuration.cloneObject();
        }
        return null;
    }
    
}

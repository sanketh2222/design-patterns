package com.scaler.lld.design.assignments.builder;

import com.scaler.lld.design.creational.builder.database.Database;

@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    DatabaseConfigurationBuilder() {
    }

    DatabaseConfigurationBuilder(DatabaseBuilder builder) {
        this.databaseUrl = builder.databaseConfigurationBuilder.databaseUrl;
        this.username = builder.databaseConfigurationBuilder.username;
        this.password = builder.databaseConfigurationBuilder.password;
        this.maxConnections = builder.databaseConfigurationBuilder.maxConnections;
        this.enableCache = builder.databaseConfigurationBuilder.enableCache;
        this.isReadOnly = builder.databaseConfigurationBuilder.isReadOnly;
    }

    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    public static class DatabaseBuilder {
        private DatabaseConfigurationBuilder databaseConfigurationBuilder;

        DatabaseBuilder() {
            this.databaseConfigurationBuilder = new DatabaseConfigurationBuilder();
        }

        public DatabaseBuilder databaseUrl(String databaseUrl) {
            this.databaseConfigurationBuilder.databaseUrl = databaseUrl;
            return this;
        }

        public DatabaseBuilder userName(String username) {
            this.databaseConfigurationBuilder.username = username;
            return this;
        }

        public DatabaseBuilder password(String password) {
            this.databaseConfigurationBuilder.password = password;
            return this;
        }

        public DatabaseBuilder maxConnections(int maxConnections) {
            this.databaseConfigurationBuilder.maxConnections = maxConnections;
            return this;
        }

        public DatabaseBuilder isReadOnly(boolean isReadOnly) {
            this.databaseConfigurationBuilder.isReadOnly = isReadOnly;
            return this;
        }

        public DatabaseBuilder enableCache(boolean enableCache) {
            this.databaseConfigurationBuilder.enableCache = enableCache;
            return this;
        }

        public DatabaseConfigurationBuilder build() {
            return new DatabaseConfigurationBuilder(this);
        }
    }
}
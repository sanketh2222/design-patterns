package com.scaler.lld.design.assignments.prototype;

public class Configuration implements ClonableObject<Configuration> {
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize,
            String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public Configuration(Configuration otherConfig) {
        this.themeColor = otherConfig.themeColor;
        this.autoSave = otherConfig.autoSave;
        this.language = otherConfig.language;
        this.darkMode = otherConfig.darkMode;
        this.fontSize = otherConfig.fontSize;
        this.fontFamily = otherConfig.fontFamily;
        this.type = otherConfig.type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    public Configuration cloneObject() {
        return new Configuration(this);
    }

    @Override
    public String toString() {
        return "Configuration [themeColor=" + themeColor + ", autoSave=" + autoSave + ", language=" + language
                + ", darkMode=" + darkMode + ", fontSize=" + fontSize + ", fontFamily=" + fontFamily + ", type=" + type
                + "]";
    }

}
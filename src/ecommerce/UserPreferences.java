package ecommerce;

import java.io.Serializable;

public class UserPreferences implements Serializable {
    private String theme;
    private String lastViewedProduct;

    public UserPreferences(String theme, String lastViewedProduct) {
        this.theme = theme;
        this.lastViewedProduct = lastViewedProduct;
    }

    public String getTheme() {
        return theme;
    }

    public String getLastViewedProduct() {
        return lastViewedProduct;
    }
}
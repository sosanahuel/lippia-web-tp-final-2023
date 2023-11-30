package lippia.web.constants;

public class ShopConstants {
    public static final String HOME_MENU_BUTTON = "xpath://div[@id='site-logo']/a/img[@title='Automation Practice Site']";
    public static final String TAX_AMOUNT = "xpath://*[@id='order_review']/table/tfoot/tr[2]/td/span";
    public static final String ADD_BOOK_BASKET = "xpath://*[contains(text(),'Selenium Ruby')]/following::a[1]";
    public static final String BOOK_AMOUNT = "xpath://*[@id='order_review']/table/tbody/tr/td[2]/span";
    public static final String BOOK_PRICE_RUBY = "xpath://*[contains(text(),'Selenium Ruby')]/following-sibling::span/span";

    public static final String BOOK_PRICE_BASKET = "xpath://*[@id='wpmenucartli']/a/span[2]";
    public static final String CLICK_BASKET_SHOP = "xpath://*[@id='wpmenucartli']/a";


}
package lippia.web.constants;

public class CheckOutConstants {

    //TABLES
    public static final String BILLING_TABLE = "id:customer_details";
    public static final String INFO_TABLE = "xpath://div[@class='woocommerce-shipping-fields']";
    public static final String ORDER_TABLE = "xpath://*[@id='order_review']/table";
    public static final String PAYMENT_TABLE = "id:payment";

    //INPUTS
    public static final String FIRST_NAME_INPUT = "xpath://*[@id='billing_first_name']";
    public static final String LAST_NAME_INPUT = "xpath://*[@id='billing_last_name']";
    public static final String COMPANY_NAME_INPUT = "xpath://*[@id='billing_company']";
    public static final String EMAIL_INPUT = "xpath://*[@id='billing_email']";
    public static final String PHONE_INPUT = "xpath://*[@id='billing_phone']";
    public static final String POSTCODE_INPUT = "xpath://*[@id='billing_postcode']";
    public static final String ADRESS_INPUT = "xpath://*[@id='billing_address_1']";
    public static final String APARTAMENT_INPUT = "xpath://*[@id='billing_address_2']";
    public static final String TOWN_INPUT = "xpath://*[@id='billing_city']";
    //DROPDOWN
    public static final String DROPDOWN_COUNTRY_CLICK = "xpath://div[@class='select2-result-label']/span";
    public static final String DROPDOWN_COUNTRY_SELECT = "ID:s2id_billing_country";
    public static final String DROPDOWN_COUNTRY_INPUT = "XPATH://input[@id='s2id_autogen1_search']";
    public static final String DROPDOWN_STATE_CLICK = "xpath://*[@id='select2-chosen-2']";
    public static final String DROPDOWN_STATE_INPUT = "xpath://*[@id='s2id_autogen2_search']";
    //COUPON
    public static final String LINK_COUPON = "xpath://*[@id='page-35']/div/div[1]/div[2]/a";
    public static final String INPUT_COUPON ="xpath://*[@id='coupon_code']";
    public static final String BUTTON_COUPON = "xpath://*[@id='page-35']/div/div[1]/form[2]/p[2]/input";
    //PAYMENT
    public static final String TRANSFER_CLICK = "xpath://*[@id='payment_method_bacs']";
    public static final String PLACE_ORDER_BUTTON = "id:place_order";
    public static final String OUR_BAK_DETAILS = "xpath://*[contains(text(),'Our Bank Details')]";
    public static final String ORDER_DETAILS = "xpath://*[@class='shop_table order_details']";
    public static final String SHOP_DETAILS = "xpath://*[@id='order_review_heading']";

}
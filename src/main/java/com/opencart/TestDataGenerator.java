package com.opencart;

import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestDataGenerator extends BasePage {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    public TestDataGenerator(WebDriver driver) {
        super(driver);
    }

    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static String password;
    private static String address;
    private static String city;
    private static int postalCode;

    //invalid inputs

    private String longFirstName;
    private String longLastName;
    private String longPassword;
    private String shortPassword;
    private static String invalidEmailAddress;

    // Street types commonly used in addresses
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};


    // Generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //generator methods
    private static String generateRandomNumberString(int length) {
        return generateRandomString(DIGITS, length);
    }

    private static String generateRandomSpecialString(int length) {
        return generateRandomString(SPECIAL, length);
    }

    // Randomizer methods
    public static String generateRandomFirstname(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }
    public static String generateRandomLastname(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }


    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }

    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    public static String generateNewRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "StokerG";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    //invalid data generation

    public static String generateRandomInvalidEmailAddress(int length) {
        String invalidEmailAddress = generateRandomString(UPPER + LOWER, length);
        return invalidEmailAddress + "@com";
    }

    public static String generateRandomInvalidPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
//        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    // generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }

    // cities rnd instance
    private static final Random rndIllinoisCities = new Random();

    // array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    // method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    // generate random postal code for Illinois
    public static int getRandomPostalCode() {
        return 60000 + RANDOM.nextInt(30000);
    }

    // array of random Illinois company names
    private static final String[] ILLINOIS_COMPANIES = {
            "Chicago Tech Solutions",
            "Illinois Manufacturing Corp.",
            "Aurora Financial Group",
            "Naperville Software Inc.",
            "Joliet Construction Services",
            "Rockford Healthcare Systems",
            "Springfield Energy LLC",
            "Elgin Logistics Co.",
            "Peoria Marketing Agency",
            "Champaign Retailers Inc.",
            "Waukegan Food Services",
            "Cicero Insurance Brokers",
            "Bloomington Media Group",
            "Arlington Heights Realty",
            "Evanston Legal Advisors",
            "Decatur Engineering LLC",
            "Schaumburg Automotive Group",
            "Bolingbrook Pharmaceuticals",
            "Palatine Educational Services",
            "Skokie Design Studio",
            "Des Plaines Electronics Ltd.",
            "Orland Park Fitness Center",
            "Tinley Park Hospitality Group",
            "Oak Lawn Consulting LLC",
            "Berwyn Industrial Solutions",
            "Mount Prospect Technologies",
            "Normal Agriculture Services",
            "Wheaton Financial Advisors",
            "Hoffman Estates Robotics",
            "Oak Park Media LLC",
            "Downers Grove IT Solutions",
            "Elmhurst Homebuilders Inc.",
            "Glenview Biotech Ltd.",
            "DeKalb Transportation Group",
            "Lombard Aerospace Inc.",
            "Moline Manufacturing Group",
            "Buffalo Grove Healthcare",
            "Bartlett Packaging Solutions",
            "Urbana Environmental Services",
            "Crystal Lake Engineering Co.",
            "Quincy Financial Corp.",
            "Streamwood Entertainment LLC",
            "Carol Stream Pharmaceuticals",
            "Romeoville Retailers Ltd.",
            "Plainfield Logistics Solutions",
            "Hanover Park Media Group",
            "Carpentersville Construction Co.",
            "Wheeling Marketing Services",
            "Park Ridge Financial Inc.",
            "Addison Security Systems",
            "Calumet City Construction Group"
    };

    // method to generate a random company name
    public static String generateRandomCompany() {
        return ILLINOIS_COMPANIES[RANDOM.nextInt(ILLINOIS_COMPANIES.length)];
    }

    //random telephone generator
    // Illinois area codes
    private static final String[] AREA_CODES = {"217", "224", "309", "312", "331", "447", "464", "618", "630", "708", "773", "779", "815", "847"};

    // generate random 7-digit number
    private static String generateRandomNumber() {
        Random telephone = new Random();
        int firstPart = 100 + telephone.nextInt(900); // Generates a number between 100 and 999
        int secondPart = 1000 + telephone.nextInt(9000); // Generates a number between 1000 and 9999
        return firstPart + "-" + secondPart;
    }

    // random Illinois phone number generator
    public static String generateIllinoisPhoneNumber() {
        Random phone = new Random();
        String areaCode = AREA_CODES[phone.nextInt(AREA_CODES.length)];
        return areaCode + "-" + generateRandomNumber();
    }

    // different return comments array
    private static final String[] RETURN_COMMENTS = {
            "The product stopped working after one week.",
            "Received the wrong item, it's completely different from what I ordered.",
            "The item arrived damaged and unusable.",
            "Product is faulty, does not turn on.",
            "The quality is poor compared to the description on the website.",
            "I found missing parts inside the package.",
            "The item overheats after a few minutes of use.",
            "Received the package, but the product is missing.",
            "Item arrived late and is defective.",
            "The product arrived in a broken box and is scratched.",
            "The product stopped functioning after a few uses.",
            "The wrong color was sent; I ordered blue, but received red.",
            "The size does not match the description.",
            "Product smells bad and feels used.",
            "Item was already damaged upon delivery.",
            "The packaging was torn open when it arrived.",
            "The product doesn't match the images on the website.",
            "Item won't connect to the necessary accessories.",
            "Received an incomplete set, missing key components.",
            "The product arrived in non-working condition."
    };

    // return a random comment from the array above
    public static String getRandomReturnComment() {
        Random comment = new Random();
        return RETURN_COMMENTS[comment.nextInt(RETURN_COMMENTS.length)];
    }

    //getters for names / email / password

    public static String getFirstName(){
        return firstName;
    }
    public static String getLastName(){
        return lastName;
    }
    public static String getEmailAddress() {
        return emailAddress;
    }
    public static String getPassword() {
        return password;
    }

    //getters for invalid / emails / passwords

    public static String getInvalidEmailAddress() {
        return invalidEmailAddress;
    }

}

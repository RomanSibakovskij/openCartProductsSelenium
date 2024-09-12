# openCartProductsSelenium
Selenium tests on openCart demo page(vbox) on register/login/logout/, available products view /addition to wish list, shopping cart, checkout, removal from wish list, submitted order view test case scenarios

#Requirements
1.Java JDK 8 or higher
2.Apache Maven
3.IntelliJ IDEA (or another IDE that supports Java and Maven)
4. VirtualBox (for openCart demo image run)

#Setup
1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE
2. Install openCart demo image into VirtualBox (download link : "https://drive.google.com/drive/u/2/folders/1TQc9-FQHGkwbzw6UrLfJxBjvvW1Nc6GI")
3. Assert the image is up and running in the VBox, copy its URL (since it's a localized image, it's not static - with each re-install it changes)
4. Open the IDE and open the project folder
5. Navigate to the pom.xml file and install all required dependencies for the test run
6. Change the BaseTest url in driver.get() to the address provided in VBox run environment (or if you have copied the one beforehand)
7. Run the test via the IDE

#Tech used for these tests:
Virtual machine : VirtualBox
Programming language: Java
Framework: Selenium WebDriver
Automation tool for build-up of project dependencies / lifecycle: Maven
Testing framework: JUnit5 (Jupiter)

# Tests list (the order/content may change as the test suite gets updated):

1. Test 001 -> navigate to register page test  
2. Test 002 -> valid user account creation  
3. Test 002a -> user account creation without checking privacy policy checkbox  
4. Test 002b -> user account creation without inputting first name  
5. Test 002c -> user account creation without inputting last name  
6. Test 002d -> user account creation without inputting email  
7. Test 002e -> user account creation without inputting password  
8. Test 002f -> user account creation with too long first name  
9. Test 002g -> user account creation with too long last name  
10. Test 002h -> user account creation with too long email  
11. Test 002i -> user account creation with too long password  
12. Test 002j -> user account creation with invalid first name format  
13. Test 002k -> user account creation with too short password  
14. Test 003 -> user account login test  
15. Test 003a -> user account logout test  
16. Test 003b -> user account login without email  
17. Test 003c -> user account login without password  
18. Test 003d -> user account login with invalid email  
19. Test 003e -> user account login with invalid password  
20. Test 003f -> user account login with non-existing email (in the database beforehand)  
21. Test 004 -> view products on homepage as a non-logged in user  
22. Test 004a -> view products on homepage as a logged in user  
23. Test 005 -> add MacBook to wishlist as a non-registered user (featured products)  
24. Test 005a -> add Apple Display to wishlist as a non-registered user (featured products)  
25. Test 005b -> add MacBook to wishlist as a non-registered user (featured products)  
26. Test 005c -> add Canon camera to wishlist as a non-registered user (featured products)  
27. Test 005d -> add MacBook to shopping cart as a non-registered user (featured products)  
28. Test 005e -> add iPhone to shopping cart as a non-registered user (featured products)  
29. Test 005f -> add Canon camera to shopping cart as a non-registered user (featured products)  
30. Test 006 -> edit user account information (first name)  
31. Test 006a -> edit user account information (last name)  
32. Test 006b -> edit user account information (email)  
33. Test 006c -> invalid edit user account information test (no first name)  
34. Test 006d -> invalid edit user account information test (no last name)  
35. Test 006e -> invalid edit user account information test (no email)  
36. Test 006f -> invalid edit user account information test (invalid first name)  
37. Test 006g -> invalid edit user account information test (invalid last name)  
38. Test 006h -> invalid edit user account information test (invalid email format)  
39. Test 007 -> view all available cameras on product page  
40. Test 007a -> view all available desktops on product page  
41. Test 007b -> view all available desktops on product page  
42. Test 007c -> view all available laptops on product page  
43. Test 007d -> view all available components on product page  
44. Test 007e -> view all available tablets on product page  
45. Test 007f -> view all available software on product page  
46. Test 007g -> view all available phones on product page  
47. Test 007h -> view all available mp3 players on product page  
48. Test 008 -> add available desktops into wishlist  
49. Test 009 -> add available laptops into wishlist  
50. Test 010 -> add available components into wishlist  
51. Test 011 -> add available tablets into wishlist  
52. Test 011a -> remove available tablets from wishlist  
53. Test 011b -> add available tablets into wishlist (into shopping cart functionality)  
54. Test 012 -> add available phones into wishlist  
55. Test 013 -> add available cameras into wishlist  
56. Test 014 -> add available mp3 players into wishlist  
57. Test 015 -> add available desktops into shopping cart  
58. Test 015a -> add available laptops into shopping cart  
59. Test 015b -> add available components into shopping cart  
60. Test 015c -> add available tablets into shopping cart  
61. Test 015d -> add available phones into shopping cart  
62. Test 015e -> add available cameras into shopping cart  
63. Test 015f -> add available mp3 players into shopping cart  
64. Test 016 -> add available desktops to checkout  
65. Test 016a -> add available laptops to checkout  
66. Test 016b -> add available components to checkout  
67. Test 016c -> add available phones to checkout  
68. Test 016d -> add available cameras to checkout  
69. Test 016e -> add available mp3 players to checkout  
70. Test 017 -> view all desktops order submitted in the order history page  
71. Test 017a -> view all laptops order submitted in the order history page  
72. Test 017b -> view all components order submitted in the order history page  
73. Test 017c -> view all phones order submitted in the order history page  
74. Test 017d -> view all cameras order submitted in the order history page  
75. Test 017e -> view all mp3 players order submitted in the order history page  
76. Test 018 -> return a singular desktop product from all desktops order submitted  
77. Test 018a -> return a singular laptop product from all desktops order submitted  
78. Test 018b -> return a singular component product from all desktops order submitted  
79. Test 018c -> return a singular phone product from all desktops order submitted  
80. Test 018d -> return a singular camera product from all desktops order submitted  
81. Test 018e -> return a singular mp3 player product from all desktops order submitted

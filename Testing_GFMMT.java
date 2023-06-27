import java.util.Scanner;

                                                // Class Google
    class Google{
          Scanner sc=new Scanner(System.in);
          String google_emailId_Original="raja@gmail.com";
          String google_password_Original="google123";

          String input_emailId_google="";    // for global variable
          String input_password_google="";

          public void googleLogin(){

            int flag_1=0;
            while (flag_1==0){
                System.out.println("Enter your Email Id");
                input_emailId_google=sc.next();
                System.out.println("Enter your Google Password");
                input_password_google=sc.next();

                if(input_emailId_google.equals(google_emailId_Original) && input_password_google.equals(google_password_Original)){
                    System.out.println("Logged in Successfully\n");
                    flag_1=1;                       // loop will over when correct email and password is given
                }
                else if (input_emailId_google.equals(google_emailId_Original)){
                    System.out.println("=========== Wrong Password ===========\n");
                }
                else if (input_password_google.equals(google_password_Original))
                    System.out.println("=========== Wrong Email Id ===========\n");
                else
                    System.out.println("============ Wrong Email Id and Wrong Password ===========\n");
            }
        }

    }






                                                // Class Facebook
    class Facebook extends Google{

        // Constructor for main method object
        Facebook(){

        }

                                                    // Login Method
        public void login(){
            System.out.println("==========Press===========");
            System.out.println("1. To Login with Google Account \n2. To Login with Facebook Account \n3. Create a Facebook Account");
            int choice_loginAccount=sc.nextInt();

            if (choice_loginAccount==1){
                googleLogin();
            }
            else if (choice_loginAccount==2){
                facebook_Login();
            }
            else if (choice_loginAccount==3){
                create_new_account_facebook();
            }
            else
                System.out.println("=========== Invalid Input ===========");
        }


                                                    // Existing Facebook Account Login

        String facebook_Id_Original="raja@facebook.com";
        String facebook_password_Original="facebook123";

        String input_facebook_Id="";
        String input_facebook_password="";
        public void facebook_Login(){

            int flag_1=0;
            while (flag_1==0){
                System.out.println("Enter your Facebook Id");
                input_facebook_Id=sc.next();
                System.out.println("Enter your Facebook Password");
                input_facebook_password=sc.next();

                if(input_facebook_Id.equals(facebook_Id_Original) && input_facebook_password.equals(facebook_password_Original)){
                    System.out.println("=========== Logged in Successfully ===========\n");
                    flag_1=1;
                }
                else if (input_facebook_Id.equals(facebook_Id_Original)){
                    System.out.println("=========== Wrong Password ===========\n");
                }
                else if (input_facebook_password.equals(facebook_password_Original))
                    System.out.println("=========== Wrong Email Id ===========\n");
                else
                    System.out.println("=========== Wrong Email Id and Wrong Password ===========\n");
            }
        }


                                                    // Creating New Facebook Account
        String firstName = "";
        String lastName = "";
        String gender = "";
        String new_facebook_id = "";
        long mobileNumber = 0;
        String new_facebook_password="";

                                                    // Constructor Of Facebook
        Facebook(String firstName , String lastName ,String gender, long mobileNumber , String new_facebook_id , String new_facebook_password ){
            this.firstName=firstName;
            this.lastName=lastName;
            this.gender=gender;
            this.mobileNumber=mobileNumber;
            this.new_facebook_id=new_facebook_id;
            this.new_facebook_password=new_facebook_password;
        }

                                                    // Display new Facebook Account details of Class (for object)
        public void display_NewFacebook_AccountDetails(){
            System.out.println("=========== Displaying Initialised non-static variable Details ==========="); // These are the details present in object non-static variables
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
            System.out.println("Gender : " + gender);
            System.out.println("Mobile Number : " + mobileNumber);
            System.out.println("New Facebook Id : " + new_facebook_id +"@facebook.com");
            System.out.println("New Facebook Password : " + new_facebook_password);
        }

        public void create_new_account_facebook(){
            int flag_NewAccount=0;
            while (flag_NewAccount==0){
                //  First Name should be of  minimum 5 character is required
                int flag_1=0;
                while(flag_1==0){
                    System.out.println("Enter the First Name ( Minimum 5 character )");
                    firstName = sc.next();
                    if (firstName.length()>=5){
                        flag_1=1;
                    }
                    else {
                        System.out.println("===== Invalid Name =====");
                    }
                }

                //  Last Name can be of minimum 2 character is required
                int flag_2=0;
                while(flag_2==0){
                    System.out.println("Enter the Last name ( Minimum 2 character )");
                    lastName = sc.next();
                    if (lastName.length()>=2){
                        flag_2=1;
                    }
                    else {
                        System.out.println(" ===== Invalid Last Name =====");
                    }
                }

                //  Gender can ONLY male or female
                int flag_3=0;
                while(flag_3==0){
                    System.out.println("Enter male or female");
                    gender = sc.next();
                    if (gender.equals("male")  || gender.equals("female")){
                        flag_3=1;
                    }
                    else {
                        System.out.println("===== Invalid Input =====");
                    }
                }

                //  Mobile Number will have 10 digits
                int flag_4=0;
                while (flag_4==0) {
                    int count = 0;
                    System.out.println("Enter the mobile number ( Number required : 10)");
                    mobileNumber = sc.nextLong();
                    long mobileNumber_checking=mobileNumber;
                    while (mobileNumber_checking > 0) {
                        count++;
                        mobileNumber_checking = mobileNumber_checking / 10;
                    }
                    if (count == 10) {
                        flag_4=1;
                    }
                    else
                        System.out.println("===== invalid number =====");
                }

                // Minimum 5 elements is required
                int flag_5=0;
                while(flag_5==0){
                    System.out.println("Enter the new facebook id ( Minimum 5 character )");
                    new_facebook_id = sc.next();
                    if (new_facebook_id.length()>=5){
                        flag_5=1;
                    }
                    else {
                        System.out.println("===== Invalid email id =====");
                    }
                }

                int flag_6=0;
                while(flag_6==0){
                    System.out.println("Enter the Password ( Minimum 5 character )");
                    new_facebook_password = sc.next();
                    if (new_facebook_password.length()>=5){
                        flag_6=1;
                    }
                    else {
                        System.out.println("===== Invalid Password =====");
                    }
                }

                System.out.println("\n=========== Entered User Details ===========");
                System.out.println("First Name : " + firstName);
                System.out.println("Last Name : " + lastName);
                System.out.println("Gender : " + gender);
                System.out.println("Mobile Number : " + mobileNumber);
                System.out.println("Facebook Id : " + new_facebook_id + "facebook.com");
                System.out.println("Facebook Password : " + new_facebook_password);

                System.out.println("=========== Press ===========");
                System.out.println("1. Confirm \n2. Reset");
                int choice_Confirm_Reset= sc.nextInt();

                if (choice_Confirm_Reset==1){
                    flag_NewAccount=1;
                    Facebook f1 = new Facebook(firstName,lastName,gender,mobileNumber,new_facebook_id,new_facebook_password);  // ( Initialising )Sending details to Non-Static Variables
                    f1.display_NewFacebook_AccountDetails();  // Displaying non-static variables of f1 object
                } else if (choice_Confirm_Reset==2) {
//                    firstName=null;
                    System.out.println("Enter Details one more Time");
                } else
                    System.out.println("Choose the Right Option");
            }
        }

                                                    // Accessing Features in Facebook


        public void accessing_Facebook_Features(){
            if (input_emailId_google.equals(google_emailId_Original) && input_password_google.equals(google_password_Original) ||
                    input_facebook_Id.equals(facebook_Id_Original) && input_facebook_password.equals(facebook_password_Original) ||
                            new_facebook_id.equals(new_facebook_id) && new_facebook_password.equals(new_facebook_password) ){

                System.out.println("=========== Displaying Facebook Login Page ===========");
                facebook_login_page_display();

                int flag_facebook_exit_features=0;
                while (flag_facebook_exit_features==0){
                    System.out.println("=========== Press ===========");
                    System.out.println("1. Chatting \n2. Uploading Photo \n3. Uploading Video \n4. GO Live \n5. Exit");
                    int choice_accessing_features=sc.nextInt();
                    switch (choice_accessing_features){
                        case 1:
                            chatting();
                            break;
                        case 2:
                            photo();
                            break;
                        case 3:
                            video();
                            break;
                        case 4:
                            live();
                            break;
                        case 5:
                            flag_facebook_exit_features=1;
                            break;
                        default:
                            System.out.println("Invalid Option");
                    }

                }

            }
        }

        // Facebook Login Page Display
        public void facebook_login_page_display(){
            System.out.println("Displaying Users uploaded pictures");
            System.out.println("Displaying Users uploaded videos");
            System.out.println("Displaying Memes\n");
        }


        // Features of Facebook

        public void chatting(){
            System.out.println("Chatting with the help of Facebook ...........\n");
        }

        public void photo(){
            System.out.println("Uploading photo ...........\n");
        }

        public void video(){
            System.out.println("Uploading video ...........\n");
        }

        public void live(){
            System.out.println("Going Live ...........\n");
        }

    }





                                                // Class Make My Trip

class MakeMyTrip extends Google{

        // For main method
        MakeMyTrip(){

        }

                                                // Login Method
    public void login(){
        System.out.println("==========Press===========");
        System.out.println("1. To Login with Google Account \n2. To Login with MakeMyTrip Account \n3. Create a MakeMyTrip Account");
        int choice_loginAccount=sc.nextInt();

        if (choice_loginAccount==1){
            googleLogin();
        }
        else if (choice_loginAccount==2){
            makeMyTrip_Login();
        }
        else if (choice_loginAccount==3){
            create_New_Account_MakeMyTrip();
        }
        else
            System.out.println("=========== Invalid Input ===========");
    }

                                                // Existing MakeMyTrip Account Login

    String makeMyTrip_Id_Original="raja@mmt.com";
    String makeMyTrip_password_Original="mmt123";

    String input_MakeMyTrip_Id="";
    String input_MakeMyTrip_password="";

    public void makeMyTrip_Login(){
        int flag_1=0;
        while (flag_1==0){
            System.out.println("Enter your MakeMyTrip Id");
            input_MakeMyTrip_Id=sc.next();
            System.out.println("Enter your MakeMyTrip Password");
            input_MakeMyTrip_password=sc.next();

            if(input_MakeMyTrip_Id.equals(makeMyTrip_Id_Original) && input_MakeMyTrip_password.equals(makeMyTrip_password_Original)){
                System.out.println("=========== Logged in Successfully ===========\n");
                flag_1=1;
            }
            else if (input_MakeMyTrip_Id.equals(makeMyTrip_Id_Original)){
                System.out.println("=========== Wrong Password ===========\n");
            }
            else if (input_MakeMyTrip_password.equals(makeMyTrip_password_Original))
                System.out.println("=========== Wrong Email Id ===========\n");
            else
                System.out.println("=========== Wrong Email Id and Wrong Password ===========\n");
        }
    }



                                                // Creating New MakeMyTrip Account
    String firstName = "";
    String lastName = "";
    String gender = "";
    String new_MakeMyTrip_Id = "";
    long mobileNumber = 0;
    String new_MakeMyTrip_Password="";

    // Constructor Of Facebook
    MakeMyTrip(String firstName , String lastName ,String gender, long mobileNumber , String new_MakeMyTrip_Id , String new_MakeMyTrip_Password ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.mobileNumber=mobileNumber;
        this.new_MakeMyTrip_Id=new_MakeMyTrip_Id;
        this.new_MakeMyTrip_Password=new_MakeMyTrip_Password;
    }

    // Display new Facebook Account details of Class (for object)
    public void display_NewMakeMyTrip_AccountDetails(){
        System.out.println("=========== Displaying Initialised non-static variable Details ==========="); // These are the details present in object non-static variables
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Gender : " + gender);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("New MakeMyTrip Id : " + new_MakeMyTrip_Id + "@mmt.com");
        System.out.println("New MakeMyTrip Password : " + new_MakeMyTrip_Password);
    }

    public void create_New_Account_MakeMyTrip(){
        int flag_NewAccount=0;
        while (flag_NewAccount==0){
            //  First Name should be of minimum 5 character is required
            int flag_1=0;
            while(flag_1==0){
                System.out.println("Enter the First Name ( Minimum 5 character )");
                firstName = sc.next();
                if (firstName.length()>=5){
                    flag_1=1;
                }
                else {
                    System.out.println("===== Invalid Name =====");
                }
            }

            //  minimum 2 character is required
            int flag_2=0;
            while(flag_2==0){
                System.out.println("Enter the Last name ( Minimum 2 character )");
                lastName = sc.next();
                if (lastName.length()>=2){
                    flag_2=1;
                }
                else {
                    System.out.println(" ===== Invalid Last Name =====");
                }
            }

            //  Gender can ONLY male or female
            int flag_3=0;
            while(flag_3==0){
                System.out.println("Enter male or female");
                gender = sc.next();
                if (gender.equals("male")  || gender.equals("female")){
                    flag_3=1;
                }
                else {
                    System.out.println("===== Invalid Input =====");
                }
            }

            //  Mobile Number will have 10 digits
            int flag_4=0;
            while (flag_4==0) {
                int count = 0;
                System.out.println("Enter the mobile number ( Number required : 10)");
                mobileNumber = sc.nextLong();
                long mobileNumber_checking=mobileNumber;
                while (mobileNumber_checking > 0) {
                    count++;
                    mobileNumber_checking = mobileNumber_checking / 10;
                }
                if (count == 10) {
                    flag_4=1;
                }
                else
                    System.out.println("===== invalid number =====");
            }

            // Minimum 5 elements is required
            int flag_5=0;
            while(flag_5==0){
                System.out.println("Enter the new MakeMyTrip id ( Minimum 5 character )");
                new_MakeMyTrip_Id = sc.next();
                if (new_MakeMyTrip_Id.length()>=5){
                    flag_5=1;
                }
                else {
                    System.out.println("===== Invalid email id =====");
                }
            }

            int flag_6=0;
            while(flag_6==0){
                System.out.println("Enter the Password ( Minimum 5 character )");
                new_MakeMyTrip_Password = sc.next();
                if (new_MakeMyTrip_Password.length()>=5){
                    flag_6=1;
                }
                else {
                    System.out.println("===== Invalid Password =====");
                }
            }

            System.out.println("\n=========== Entered User Details ===========");
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
            System.out.println("Gender : " + gender);
            System.out.println("Mobile Number : " + mobileNumber);
            System.out.println("New MakeMyTrip Id : " + new_MakeMyTrip_Id + "@mmt.com");
            System.out.println("New MakeMyTrip Password : " + new_MakeMyTrip_Password);

            System.out.println("=========== Press ===========");
            System.out.println("1. Confirm \n2. Reset");
            int choice_Confirm_Reset= sc.nextInt();

            if (choice_Confirm_Reset==1){
                flag_NewAccount=1;
                MakeMyTrip m1 = new MakeMyTrip(firstName,lastName,gender,mobileNumber,new_MakeMyTrip_Id,new_MakeMyTrip_Password);  // ( Initialising )Sending details to Non-Static Variables
                m1.display_NewMakeMyTrip_AccountDetails();  // Displaying non-static variables of f1 object
            } else if (choice_Confirm_Reset==2) {
//                firstName=null;
                System.out.println("Enter Details one more Time");
            } else
                System.out.println("Choose the Right Option");
        }
    }


                                                // Accessing Features of MakeMyTrip

    public void accessing_MakeMyTrip_Features(){
        if (input_emailId_google.equals(google_emailId_Original) && input_password_google.equals(google_password_Original) ||
                input_MakeMyTrip_Id.equals(makeMyTrip_Id_Original) && input_MakeMyTrip_password.equals(makeMyTrip_password_Original) ||
                new_MakeMyTrip_Id.equals(new_MakeMyTrip_Id) && new_MakeMyTrip_Password.equals(new_MakeMyTrip_Password) ){

            int flag_MakeMyTrip_Exit_Features=0;
            while (flag_MakeMyTrip_Exit_Features==0){
                System.out.println("=========== Press ===========");
                System.out.println("1. Booking a Flight \n2. Booking a Bus \n3. Booking a Train \n4. Book a Room \n5. Exit");
                int choice_accessing_features=sc.nextInt();
                switch (choice_accessing_features){
                    case 1:
                        bookFlight();
                        break;
                    case 2:
                        bookBus();
                        break;
                    case 3:
                        bookTrain();
                        break;
                    case 4:
                        bookRoom();
                        break;
                    case 5:
                        flag_MakeMyTrip_Exit_Features=1;
                        break;
                    default:
                        System.out.println("Invalid Option");
                }

            }

        }
    }

                                            // MakeMyTrip Login Page Content

    public void displaying_MakeMyTrip_Login_Page(){
        System.out.println("Fight Booking Offers");
        System.out.println("Train Booking Offers");
        System.out.println("Bus Booking Offers\n");
    }

                                                // Features of MakeMyTrip

        public void bookFlight(){
            System.out.println("Booked flight Successfully ...........\n");
        }

        public void bookBus(){
            System.out.println("Booked bus Successfully ...........\n");
        }

        public void bookTrain(){
            System.out.println("Booked Train Successfully ...........\n");
        }

        public void bookRoom(){
            System.out.println("Room booked successfully ...........\n");
        }

    }




                                                    // Class For Execution
    class Testing_GFMMT{
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("==========Press==========");
            System.out.println("1. Facebook \n2. Make My Trip");
            int choice_website=sc.nextInt();
            System.out.println();

            if (choice_website==1){
                Facebook f1 =new Facebook();
                f1.login();
                f1.accessing_Facebook_Features();
            }
            else if (choice_website==2){
                MakeMyTrip m1 = new MakeMyTrip();
                m1.displaying_MakeMyTrip_Login_Page();  // Display Login Page content
                m1.login();
                m1.accessing_MakeMyTrip_Features();
            }
            else
                System.out.println("Invalid Input");

    }
}

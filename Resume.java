public class Resume {
    public static void main(String[] args) {
       
       // Personal Information
       String name = "Sagar Sidaji Bhuse";
       String email = "sagarboss0718@email.com";
       String phone = "+1 123-456-7890";
       
       // Education
       String[] education = {"Bachelor's in Computer Applications,  solapur University, 2018-2021",
                             "Master's in Computer Application, pune University, 2021-2023"};
       
       // Skills
       String[] skills = {"Java", "Python", "C++", "HTML/CSS", "JavaScript"};
       
       // Work Experience
       String[] workExperience = {"Software Developer, XYZ Company, 2021-2022",
                                  "Senior Software Developer, ABC Company, 2022",
                                  "Software Architect, DEF Company, 2023-Present"};
        
       
       // Display Resume
       System.out.println("Name: " + name);
       System.out.println("Email: " + email);
       System.out.println("Phone: " + phone);
       System.out.println("\nEducation:");
       for (String edu : education) {
          System.out.println("- " + edu);
       }
       System.out.println("\nSkills:");
       for (String skill : skills) {
          System.out.println("- " + skill);
       }
       System.out.println("\nWork Experience:");
       for (String workExp : workExperience) {
          System.out.println("- " + workExp);
       }
       
    }
 }
 
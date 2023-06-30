# HTD-Work

### This repo consist of Avensys JAVA fullstack training documentation of learnings, tutorials and assignments.

# Project 1


# Project 2 -  Social Media Platform

This project aims to create a social media platform using Java, Spring, and Angular. The platform allows users to view and create posts with various types of content, including hyperlinks and media (videos), along with captions. Users can sign up, log in, and manage their own posts. An admin role is available to manage the platform, including maintaining posts and users.

## Features

1. **Feeds Page**: Users can view the contents of posts on the feeds page. All users see the same posts.

2. **User Feed Page**: User can visit his own profile page where he can view all his own post. 

3. **Post Content**: Each post can contain either a hyperlink or media (image or video) along with a caption.

4. **User Authentication**: Users are required to log in to view and create posts. The platform provides a sign-up page for account creation and login page for users to login.

5. **Post Creation**: Users can create posts from the all feeds page and user feed page.

6. **Post Updates and Delete**: Only the user who created a post can update it. As a user viewing his own profile page, he can update and delete his own posts. In his own profile page, he can also edit his own profile.

7. **Admin Role**: An admin role is available to manage the platform. Admins can maintain posts (delete/update any posts) and maintain users (delete/update). A user can also chnage the role of other users.

## Additional Features
8. Main search function in the navbar for users to search and view others profile
   
9. Admin manage post and user profile table has pagination function which allow users to change size of each page
    
10. Admin filter function to filter posts by content and filter user profiles based on first name, last name and email.
    
11. Allow user to preview image and video when creating post before uploading to database

## Technical Considerations

- **Entity Design**: Entities should be well-designed and include audit fields such as "created by" and "created date." 

- **API Security**: APIs should be secured to allow access only to logged-in users, ensuring the privacy and security of the platform.

- **Input Validations**: The platform should include input validations, and appropriate error messages should be displayed to users when validation fails.

- **Component Design**: The design of the Angular/React frontend should use small, reusable components to cater to the requirements. Different components should be used to display different types of media.

- **Post Types**: Consider implementing three types of posts to handle hyperlinks, images, and videos. The fields "link" and "media" should be optional depending on the post type.

- **Media Management**: When deleting a post, the associated media should also be deleted to maintain data consistency.

## Installation and Setup

To set up the social media platform, follow these steps:

1. Clone the repository to your local machine.

2. Install the necessary dependencies for the backend(maven clean install) and frontend "npm install" components.

3. Configure the database connection, other server settings and cloudinary in the backend.
![image](https://github.com/Kohhx/social-media-java-fullstack/assets/108639973/7fa5e9f1-25b9-43bd-84ae-969995e2f347)

4. Set up the frontend by configuring API endpoints and any additional settings.

5. Build the project to compile the source code and generate the required files.

6. Deploy the application to a suitable hosting environment or run it locally for development and testing purposes.

For detailed installation and setup instructions specific to your chosen technologies, please refer to the project's documentation.

## Usage

Once the social media platform is set up, follow these steps to use the application:

1. Access the platform through a web browser.

2. Log in using your credentials or create a new account using the provided sign-up page.

3. Explore the feeds page to view the posts and their contents.

4. Click on a post to open the associated link or play the video.

5. Create your own posts that will appear on the feeds page.

6. If you have the admin role, you can manage posts and users, including deleting or updating them.


# Project 3 - CV Parsing Application

This project aims to develop a CV Parsing application using Java Fullstack technologies. The application will extract specific fields from Word/PDF format CVs, including Name, Email ID, Mobile No., Skills, Years of Experience, and Recent 3 Companies.

## Requirements

### Backend Development

- Accept Word/PDF format CV files as input.
- Implemented a parser to extract information from the CV files. Since all the resumes do not follow a specific format, Generative Pre-trained Transformer (GPT API) large language models (LLMs) was used to facilitate the parsing of CVs into the required JSON format.
- Extract the following fields from each CV:
  - Name (string): The name of the candidate.
  - Email ID (string): The email address of the candidate.
  - Mobile No. (string): The mobile number of the candidate.
  - Skills (string or array): The skills possessed by the candidate.
  - Years of Experience (number): The number of years of experience of the candidate.
  - Recent 3 Companies (string or array): The names of the recent 3 companies the candidate has worked for.
- Store the extracted information in a database for further processing.
- Implement validation and error handling in the backend.

### Frontend Development

- Create a user interface using a react framework and bootstrap CSS framework
- Implement a drag and drop form input that allows CV in word document or PDF format to be uploaded by users.
- Display the extracted information for each CV, including the fields mentioned above. Allow users to update extracted fields if incorrect.
- Provide search functionality to find candidates based on their name or skills.
- Utilize form validation to ensure correct file formats (Word/PDF) are uploaded.

### Integration

- Connect the frontend and backend by making API calls from the frontend to send CV files and retrieve extracted information.
- Implement error handling and display appropriate error messages to the user when necessary.
- Ensure data consistency between the frontend and backend.

### Features
- Applications accepts 2 main roles
  - Free role
    - As a free subscriber to the application, free user can upload a maximum of 5 CV to be parsed.
  - Paid role
    - As a paid subscriber to the application, paid user can upload unlimited number of CVs to be parsed. User can view all his CVs, filter them based on name or skills. User also have the options to export filtered data to excel or single resume details to excel for further processing.

### Additional Features 
- Admin role
  - As an admin of the application, user have access to all the features available for a paid subscriber. In addition to that, an admin user can view all users resume, filter resumes by name and skills, perform crud functions, export to excel and plot visual statistical charts to facilitate data processing and filtering.
 
- User are able to view a preview of the PDF CV attached prior to uploading.

## Installation and Setup

To set up the CV Parsing application, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies for the frontend using "npm install" and backend components(maven clean install).
3. Set up the backend application properties by configuring the MySQL database setting, server setting and chatGPT api settings.
![image](https://github.com/Kohhx/cvparser-java-fullstack/assets/108639973/fa047644-b7ab-4ea6-9e11-219ccd89b163)

5. Set up the frontend by configuring the API endpoint and any additional settings.
6. Build the project to compile the source code and generate the necessary files.

Please refer to the project's documentation for detailed installation and setup instructions specific to your chosen technologies.

## Usage

Once the application is set up, follow these steps to use the CV Parsing application:

1. Access the application through a web browser.
2. Upload a Word/PDF format CV file using the provided form.
3. The application will process the file and extract the relevant information.
4. The extracted information will be displayed on the user interface. User can update errorous extracted information.
5. Use the search functionality to find candidates based on their name or skills.
6. Explore any additional features, such as exporting the data or viewing visualizations.

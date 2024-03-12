# jest json to junit xml conversion

Convert results of multiple junit xml files in chronological order &amp; uploads the test cases to Test
Observability

### To use the windows executable follow the below instructions

- Download the junitupload-win directory to your local machine
- Set Environment variables BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY
- Change directory using the below command
    ```sh
      cd junitupload-win
    ```
- Get the path of the jest json report
- Run the junit upload command with required parameters
    ```sh
      junitupload.exe ^
      -p "Your Project Name" -b "Your Build Name" -i buildnum -t "your build tag" ^
      -f "jest, 27.9.0" -c "Your jenkins host url" ^
      -d "<Path to the Input jest json file without the angled brackets>" ^
      -o "<Path to the Output Directory without the angled brackets>"
    ```
- Verify the results in the Test Observability dashboard

### To use the Mac binary follow the below instructions

- Download the junitupload-mac directory to your local machine
- Set Environment variables BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY
- - Change directory using the below command
    ```sh
      cd junitupload-mac
    ```
- Get the path of the jest json report
- Run the junit upload command with required parameters
    ```sh
      ./junitupload.sh \
      -p "Your Project Name" -b "Your Build Name" -i buildnum -t "your build tag" \
      -f "jest, 27.9.0" -c "http://localhost:8080" \
      -d "<Path to the Input jest json file without the angled brackets>" \
      -o "<Path to the Output Directory without the angled brackets>"
    ```
- Verify the results in the Test Observability dashboard

### To use the Linux binary follow the below instructions

- Download the junitupload-lin directory to your local machine
- Set Environment variables BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY
- - Change directory using the below command
    ```sh
      cd junitupload-lin
    ```
- Get the path of the jest json report
- Run the junit upload command with required parameters
    ```sh
      ./junitupload.sh \
      -p "Your Project Name" -b "Your Build Name" -i buildnum -t "your build tag" \
      -f "jest, 27.9.0" -c "http://localhost:8080" \
      -d "<Path to the Input jest json file without the angled brackets>" \
      -o "<Path to the Output Directory without the angled brackets>"
    ```
- Verify the results in the Test Observability dashboard
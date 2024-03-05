# junit-result-aggregator

Aggregate the results of multiple junit xml files in chronological order &amp; uploads the test cases to Test
Observability

### To use the executable follow the below instructions

- Download the junitupload directory to your local machine
- Set Environment variables BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY
- Run the junit upload command with required parameters
    ```sh
      junitupload.exe ^
      -p "Coursera" -b "Junit Upload" -i 18 -t "windows" ^
      -f "jest, 27.9.0" -c "http://localhost:8080" ^
      -d "<Path to the Input Directory without the angled brackets>" ^
      -o "<Path to the Output Directory without the angled brackets>"
    ```
- Verify the results in the Test Observability dashboard

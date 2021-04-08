# API Design
## Request Details:
```
    Endpoint: 
        GET /group-count
    RequestParams:
        filepath: 
            type: string
            description: Location of input file (Could be on ftp server or S3). This is a required field. File size should be below 100 MB. Accepted File type: CSV
        columns: 
            type: string
            description: Comma separated list of column names on which to group. This is a required field.
    Example:
        https://coding-assessment.com/group-count?filepath=s3://test-bucket/crunchbase.csv&columns=company,url
```
## Response Details:

### Response object:
```
{
    size : <size of results>
    results : [
        {
            group : <list of column values for provided column names>,
            count: <count for the group>
        }
    ]
}
```
### Field Details:
```
size: 
    type: List<String>
    description: Total size of the results.
results:
    type: List<Object>
    fields:
        group:
            type: List<String>
            description: column values for provided columns in a group
        count:
            type: long
            description: count for the group occurrances
 ```   
### Response Codes:
```
200: Operation completed successfully.
400: Validation failed.
404: File not found.
```
# api_parser_todb
Spring RESTfull app with db and parsing from public api

This Java Spring web-application was made to get data about countries from 3rd party api.
User can input country name in form. If we already have this country in database,we use JQuery to help user to input country name.
It does not matter if we don't have country in database - at this case we are trying to find out about country in API.
After we get country from api, we show it to user, and save it to database for future usage.

Used technologies: Java language, Spring Framework, MySql Database, Hibernate Framework, Jackson lib, Unirest lib, JQuery,
Thymeleaf template. (That's all I remembered)

Here is no cool css or other frontend features, bcs in this project I just wanted to parse JSON I get from API to my DB and create 
method of searching info in both DB and API. 
If you wanna to improve it, I suggeset you:
1. Handle 404 API error (I just don't want to do that right now).
2. Make better autocomplete and DB search that could find country by it's native name (bcs api can do that with both eng\native
variantes, ex. API can find Germany if you type "Germany" or "Deutschland"). 
3. Also need to debug JP language - it's ok with object from API, but in Database it converts into "????", I think it because of
UTF-8, maybe need to change to some JP UTF-8 variant.

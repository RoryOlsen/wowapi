wowapi
======
A Java client for the World of Warcraft Web API.

## How to Use ##
1. Create an instance of WowApi with one of the continental regions.
2. You can then get almost any information that you want from characters, to guilds, spells, items, etc... all as Java objects!

For example, to create an API client for the US region:

```
WowApi wowApi = new WowApi(US);
wowApi.getQuestById(13146);
```

This will return a object of type Quest with the quest data.

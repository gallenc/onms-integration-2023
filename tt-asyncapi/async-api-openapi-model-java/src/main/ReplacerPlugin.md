## documentation for replacer plugin

ParameterRequiredDescription token(see note below)The text to replace within the given file. This may or may not be a regular expression 
(see regex notes above). tokenValueMap(see note below)A file containing tokens and respective values to replace with. 
This file may contain multiple entries to support a single file containing different tokens to have replaced. E
ach token/value pair should be in the format: "token=value" (without quotations). 

If your token contains ='s you must escape the = character to \=. e.g. tok\=en=value variableTokenValueMap(see note below)
Similar to tokenValueMap but incline configuration inside the pom. Token/Value pairs are separated by a comma (",") 
instead of new lines. This parameter may contain multiple entries to support a single file containing different tokens to have replaced. 
Each token/value pair should be in the format: "token1=value1,token2=value2" (without quotations). commentsEnabledno (default: true)
Enables comments within the tokenValueMap (denoted by '#'). If your token starts with an '#', then you must supply the commentsEnabled 
parameter and with a value of false. tokenFile(see note below)A file containing the token to be replaced. May be multiple words or lines. 
This is useful if you do not wish to expose the token within your pom or the token is long. valueno (default: empty)T
he text to be written over any found tokens. 

If no value is given, the tokens found are replaced with an empty string 
(effectively removing any tokens found). 

You can also reference grouped regexp matches made in the token here by $1, $2, etc. valueFilenoA 
file containing a value to replace the given token with. May be multiple words or lines. 
This is useful if you do not wish to expose the value within your pom or the value is long. regexno (default: true)
Indicates if the token should be located with regular expressions. 

This should be set to false if the token contains 
regex characters which may miss the desired tokens or even replace the wrong tokens. 
regexFlags:regexFlagno (list cannot be empty if used)List of standard Java regular expression Pattern flags 
(see Java Doc). 
May contain multiple flags. May only be of the following: 
CANON_EQ, CASE_INSENSITIVE, COMMENTS, DOTALL, LITERAL, MULTILINE, UNICODE_CASE, UNIX_LINES. 
replacements:replacementno (list of token/value pairs to replace within the given file)
Each replacement element to contain sub-elements as token/value pairs. 
Each token within the given file will be replaced by it's respective value. unescapeno (does not unescape by default)
Unescapes tokens and values which contain escaped special characters. e.g. token\n123 would match tokens: token(new line)123. 
delimiters:delimiternoAdd a list of delimiters which are added on either side of tokens to match against. e.g. @ would match @token@. 
You may also use the '' character to place the token in the desired location for matching. e.g. ${} would match ${token}. 
xpathnoUse X-Path to locate a document node to perform replacements upon. This parameter takes an X-Path expression. 
Since 1.4.0 - Issue 58.

Note: Either a token, tokenFile or tokenValueMap is required. An execution should not contain more than one of these.
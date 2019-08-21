package com.language.beans;

public class Languageclass {
String language,name;
public void setLanguage(String lang) {
	language=lang;
}
public void setName(String name) {
	this.name=name;
}
public String getLanguage() {
	return language;
}
public String getName() {
	return name;
}
public String getLanguageComments() {
	if(language.equals("java")) {
		return "you have choosen A1 language";
	} else if(language.equals("c")){
		return "i'm happy that you are starting your career with C";
	} else if(language.equals("c++")){
		return "i'm glad that you have chosen c++ as oopl language";
	} 
		return "i'm amazed that you have choosen the toughest language";
}

}

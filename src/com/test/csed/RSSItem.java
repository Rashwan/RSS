package com.test.csed;
public class RSSItem {

private String title = null;
private String description = null;
RSSItem(){
}

void setTitle(String value)
{
title = value;
}

void setDescription(String value)
{
description = value;
}

String getTitle()
{
return title;
}

String getDescription()
{
return description;
}

@Override
public String toString() {

return title;
}
}
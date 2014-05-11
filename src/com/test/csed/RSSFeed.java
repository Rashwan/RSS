package com.test.csed;

import java.util.List;
import java.util.Vector;

public class RSSFeed {
private String title = null;
private String description = null;
private List<RSSItem> itemList;

RSSFeed(){
itemList = new Vector<RSSItem>(0);
}

void addItem(RSSItem item){
itemList.add(item);
}

RSSItem getItem(int location){
return itemList.get(location);
}

List<RSSItem> getList(){
return itemList;
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
}
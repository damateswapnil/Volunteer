package org.openqa.selenium;
import java.util.List;

public class CustmizeDropdown {
	private List<WebElement> ele;
	private int si;
	
	public CustmizeDropdown(List<WebElement> ele) {
		this.ele=ele;
		this.si=ele.size();}

	public void getText() {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getText();
			System.out.println(valueAttribute);}}

	public void getClassValue() {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getAttribute("class");
			System.out.println(valueAttribute);
			}}

	public void getIdValue() {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getAttribute("id");
			System.out.println(valueAttribute);}}
	public void getTagName() {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getTagName();
			System.out.println(valueAttribute);
		}}

	public void getLinkValue() {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getAttribute("href");
			System.out.println(valueAttribute);
		}}

	public void selectByIndex(int in) {
		for(int l=0;l<si;l++) {
			if(l==in) {
				ele.get(in).click();
			}}}

	public void selectByValue(String in) {
		for(int l=0;l<si;l++) {
			String valueAttribute = ele.get(l).getAttribute("value");
			if(valueAttribute.equals(in)) {
				ele.get(l).click();
			}}}

	public void selectByVisibleText(String in) {
		for(int l=0;l<si;l++) {
			String valueText = ele.get(l).getText();
			if(valueText.equals(in)) {
				ele.get(l).click();
			}}}}
package com.example.zuulgate.filters.pre;

import com.netflix.zuul.ZuulFilter;

public class FilterTwo extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		System.out.println("from filterTwo..");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}

package com.hotpaxos.framework.common.utils;

import java.util.regex.Pattern;

/**
 * User: lijinpeng
 * Created by Shanghai on 2019/12/22.
 */
public class HotpaxosConstans {
    public static final String SEPERATOR_ACCESS_LOG = "|";
    public static final String COMMA_SEPARATOR = ",";
    public static final Pattern COMMA_SPLIT_PATTERN = Pattern.compile("\\s*[,]+\\s*");
    public static final String PROTOCOL_SEPARATOR = "://";
    public static final String PATH_SEPARATOR = "/";
    public static final String PATH_UNDERLINE = "_";
    public static final String REGISTRY_SEPARATOR = "|";
    public static final Pattern REGISTRY_SPLIT_PATTERN = Pattern.compile("\\s*[|;]+\\s*");
    public static final String SEMICOLON_SEPARATOR = ";";
    public static final String COLON_SEPARATOR = ":";
    public static final Pattern SEMICOLON_SPLIT_PATTERN = Pattern.compile("\\s*[;]+\\s*");
    public static final String QUERY_PARAM_SEPARATOR = "&";
    public static final Pattern QUERY_PARAM_PATTERN = Pattern.compile("\\s*[&]+\\s*");
    public static final String EQUAL_SIGN_SEPERATOR = "=";
    public static final Pattern EQUAL_SIGN_PATTERN = Pattern.compile("\\s*[=]\\s*");
    public static final int SECOND_MILLS = 1000;
    public static final int MINUTE_MILLS = 60 * SECOND_MILLS;
    public static final int DEFAULT_VALUE = 0;
    public static final String Empty= "";
}
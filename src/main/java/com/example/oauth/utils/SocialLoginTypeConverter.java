package com.example.oauth.utils;

import com.example.oauth.config.oauth.SocialLoginType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocialLoginTypeConverter implements Converter<String, SocialLoginType> {
    @Override
    public SocialLoginType convert(String s) {
        return SocialLoginType.valueOf(s.toUpperCase());
    }
}

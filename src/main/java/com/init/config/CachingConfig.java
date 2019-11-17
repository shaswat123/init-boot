package com.init.config;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CachingConfig  extends CachingConfigurerSupport{

    //Adding multiple caching
    @Bean
    public CacheManager ehCacheManager()

    {

        CacheConfiguration tenSecondCache = new CacheConfiguration();
        tenSecondCache.setName("ten-sec-cache");
        tenSecondCache.setMemoryStoreEvictionPolicy("LRU");
        tenSecondCache.setMaxEntriesLocalHeap(1000);
        tenSecondCache.setTimeToLiveSeconds(10);

        CacheConfiguration twentySecondCache = new CacheConfiguration();
        twentySecondCache.setName("twenty-sec-cache");
        twentySecondCache.setMemoryStoreEvictionPolicy("LRU");
        twentySecondCache.setMaxEntriesLocalHeap(1000);
        twentySecondCache.setTimeToLiveSeconds(20);

        net.sf.ehcache.config.Configuration configuration = new net.sf.ehcache.config.Configuration();
        configuration.addCache(tenSecondCache);
        configuration.addCache(twentySecondCache);
        return CacheManager.newInstance(configuration);

    }

    @Bean
    @Override
    public org.springframework.cache.CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheManager());
    }
}

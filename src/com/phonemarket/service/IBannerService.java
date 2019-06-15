package com.phonemarket.service;

import com.github.pagehelper.PageInfo;
import com.phonemarket.entity.Banner;

import java.util.List;

public interface IBannerService {
    PageInfo<Banner> findAllBannerBySplitePage(Integer page, Integer limit, String keyword);

    List<Banner> findAllShowBanner();

    Integer updateBanner(Banner banner);

    Integer changeBannerState(Integer state, Integer bannerId);

    Integer deleteBanner(Integer bannerId);

    Integer addBanner(Banner banner);
}


package com.example.imageapp.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ImageResponse {

    private String status;
    private String msg;
    private Integer paginationlimit;
    private List<Wallpaper> wallpapers;
    private Integer count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getPaginationlimit() {
        return paginationlimit;
    }

    public void setPaginationlimit(Integer paginationlimit) {
        this.paginationlimit = paginationlimit;
    }

    public List<Wallpaper> getWallpapers() {
        return wallpapers;
    }

    public void setWallpapers(List<Wallpaper> wallpapers) {
        this.wallpapers = wallpapers;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

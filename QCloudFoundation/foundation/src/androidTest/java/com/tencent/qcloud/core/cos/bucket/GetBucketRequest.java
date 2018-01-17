package com.tencent.qcloud.core.cos.bucket;

import com.tencent.qcloud.core.cos.CosXmlRequest;

/**
 * <p>
 * GetBucket 请求用于列出该 Bucket 下的部分或者全部 Object。
 * </p>
 *
 */
final public class GetBucketRequest extends CosXmlRequest<GetBucketResult> {
    /** Prefix match, used to specify the prefix address of the returned file */
    private String prefix = null;

    /** Delimiter is a sign，
     *  If Prefix exists, the same paths between Prefix and delimiter will be grouped as the same
     *  type and defined Common Prefix, then all Common Prefixes will be listed.
     *  If Prefix doesn't exist, the listing process will start from the beginning of the path
     */
    private String delimiter = null;

    /** Specify the encoding method of the returned value */
    private String encodingType;

    /** Entries are listed using UTF-8 binary order by default, starting from the marker */
    private String marker = null;

    /** Max number of entries returned each time, default is 1000 */
    private String maxKeys = "1000";

    /**
     * 设置匹配前缀，用来规定返回的文件前缀地址。
     *
     * @param prefix 前缀
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * 获取请求的匹配前缀。
     *
     * @return 请求前缀
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * 设置定界符 delimiter
     * </p>
     * <p>
     * 定界符为一个符号，如果有 Prefix，则将 Prefix 到 delimiter 之间的相同路径归为一类，定义为 Common Prefix，然后列出所有 Common Prefix。如果没有 Prefix，则从路径起点开始。
     * </p>
     *
     * @param delimiter
     */
    public void setDelimiter(char delimiter) {
        this.delimiter = String.valueOf(delimiter);
    }

    /**
     * 获取请求的定界符
     *
     * @return
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * 设置返回值的编码方式，可选值：url
     *
     * @param encodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * 获取返回值的编码类型。
     *
     * @return
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * 设置列出文件的marker
     * </p>
     * <p>
     * 默认以 UTF-8 二进制顺序列出条目，所有列出条目从marker开始
     * </p>
     *
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * 获取请求的marker
     *
     * @return
     */
    public String getMarker() {
        return marker;
    }

    /**
     * 设置单次返回的最大条目数。默认为1000
     *
     * @param maxKeys
     */
    public void setMaxKeys(long maxKeys) {
        this.maxKeys = String.valueOf(maxKeys);
    }

    /**
     * 获取请求的最大条目数
     *
     * @return
     */
    public long getMaxKeys() {
        return Long.parseLong(maxKeys);
    }
}

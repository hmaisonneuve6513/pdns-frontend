package net.osnworld.pdnsfrontend.dns_elements;

import java.lang.String;

public class dns_record {
    private String rec_owner;
    private String rec_type;
    private String rec_name;
    private String rec_content;
    private boolean rec_disabled;
    private String rec_comment;
    private int rec_ttl;

    public dns_record(String domain, String type, String name, String content, boolean disabled, String comment, int ttl) {
        rec_owner = domain;
        rec_type = type;
        rec_name = name;
        rec_content = content;
        rec_disabled = disabled;
        rec_comment = comment;
        rec_ttl = ttl;
    }

}

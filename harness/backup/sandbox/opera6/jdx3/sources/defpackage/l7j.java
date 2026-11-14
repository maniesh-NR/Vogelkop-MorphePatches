package defpackage;

/* loaded from: classes.dex */
public enum l7j {
    DEVICE_DEFAULT(""),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUDFLARE("https://opera.cloudflare-dns.com/dns-query"),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE("https://dns.google/dns-query{?dns}"),
    CUSTOM("");

    public final String a;

    l7j(String str) {
        this.a = str;
    }
}

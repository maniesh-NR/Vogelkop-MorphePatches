package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y9c {
    public static final hr5 a;
    public static final y9c b;
    public static final y9c c;
    public static final y9c d;
    public static final y9c e;
    public static final y9c f;
    public static final y9c g;
    public static final /* synthetic */ y9c[] h;

    static {
        y9c y9cVar = new y9c("PRODUCT_AND_SERVICE_NEWS", 0);
        b = y9cVar;
        y9c y9cVar2 = new y9c("WEATHER_FORECAST", 1);
        c = y9cVar2;
        y9c y9cVar3 = new y9c("LIVE_SCORE", 2);
        d = y9cVar3;
        y9c y9cVar4 = new y9c("REWARDS", 3);
        e = y9cVar4;
        y9c y9cVar5 = new y9c("WEATHER_ALERT", 4);
        f = y9cVar5;
        y9c y9cVar6 = new y9c("ESIM", 5);
        g = y9cVar6;
        h = new y9c[]{y9cVar, y9cVar2, y9cVar3, y9cVar4, y9cVar5, y9cVar6};
        a = new hr5();
    }

    public static y9c valueOf(String str) {
        return (y9c) Enum.valueOf(y9c.class, str);
    }

    public static y9c[] values() {
        return (y9c[]) h.clone();
    }
}

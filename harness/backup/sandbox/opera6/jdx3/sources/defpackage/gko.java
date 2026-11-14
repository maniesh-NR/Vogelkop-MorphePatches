package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gko {
    public static final tmj c;
    public static final EnumSet d;
    public static final gko e;
    public static final gko f;
    public static final gko g;
    public static final gko h;
    public static final gko i;
    public static final gko j;
    public static final gko k;
    public static final gko l;
    public static final gko m;
    public static final gko n;
    public static final gko o;
    public static final gko p;
    public static final gko q;
    public static final gko r;
    public static final /* synthetic */ gko[] s;
    public static final /* synthetic */ h58 t;
    public final String a;
    public final Set b;

    static {
        gko gkoVar = new gko("CLOSE", 0, "close", null);
        gko gkoVar2 = new gko("CREATE_CALENDAR_EVENT", 1, "createCalendarEvent", Collections.singleton("eventJSON"));
        e = gkoVar2;
        gko gkoVar3 = new gko("EXPAND", 2, "expand", null);
        f = gkoVar3;
        gko gkoVar4 = new gko("OPEN", 3, "open", null);
        g = gkoVar4;
        gko gkoVar5 = new gko("PLAY_VIDEO", 4, "playVideo", Collections.singleton(ImagesContract.URL));
        h = gkoVar5;
        gko gkoVar6 = new gko("RESIZE", 5, "resize", null);
        i = gkoVar6;
        gko gkoVar7 = new gko("SET_ORIENTATION_PROPERTIES", 6, "setOrientationProperties", e82.E(new String[]{"allowOrientationChange", "forceOrientation"}));
        j = gkoVar7;
        gko gkoVar8 = new gko("SET_RESIZE_PROPERTIES", 7, "setResizeProperties", e82.E(new String[]{"width", "height", "offsetX", "offsetY", "customClosePosition", "allowOffscreen"}));
        k = gkoVar8;
        gko gkoVar9 = new gko("STORE_PICTURE", 8, "storePicture", Collections.singleton(ImagesContract.URL));
        l = gkoVar9;
        gko gkoVar10 = new gko("USE_CUSTOM_CLOSE", 9, "useCustomClose", Collections.singleton("useCustomClose"));
        m = gkoVar10;
        gko gkoVar11 = new gko("BLOCK_AD", 10, "blockAd", null);
        n = gkoVar11;
        gko gkoVar12 = new gko("ENABLE_BACK_BUTTON", 11, "enableBackButton", null);
        o = gkoVar12;
        gko gkoVar13 = new gko("OPEN_PRIVACY", 12, "openPrivacy", Collections.singleton(ImagesContract.URL));
        p = gkoVar13;
        gko gkoVar14 = new gko("REPORT_EVENT", 13, "reportEvent", Collections.singleton("evt"));
        q = gkoVar14;
        gko gkoVar15 = new gko("REWARD_GRANTED", 14, "rewardGranted", null);
        r = gkoVar15;
        gko[] gkoVarArr = {gkoVar, gkoVar2, gkoVar3, gkoVar4, gkoVar5, gkoVar6, gkoVar7, gkoVar8, gkoVar9, gkoVar10, gkoVar11, gkoVar12, gkoVar13, gkoVar14, gkoVar15};
        s = gkoVarArr;
        t = new h58(gkoVarArr);
        c = new tmj((byte) 11);
        d = EnumSet.of(gkoVar4, gkoVar11, gkoVar13, gkoVar14);
    }

    public gko(String str, int i2, String str2, Set set) {
        this.a = str2;
        this.b = set;
    }

    public static gko valueOf(String str) {
        return (gko) Enum.valueOf(gko.class, str);
    }

    public static gko[] values() {
        return (gko[]) s.clone();
    }
}

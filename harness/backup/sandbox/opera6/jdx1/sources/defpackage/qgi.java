package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qgi {
    public static final qgi a;
    public static final qgi b;
    public static final qgi c;
    public static final qgi d;
    public static final HashMap e;
    public static final /* synthetic */ qgi[] f;

    /* JADX INFO: Fake field, exist only in values array */
    qgi EF1;

    static {
        qgi qgiVar = new qgi("svg", 0);
        qgi qgiVar2 = new qgi("a", 1);
        qgi qgiVar3 = new qgi("circle", 2);
        qgi qgiVar4 = new qgi("clipPath", 3);
        qgi qgiVar5 = new qgi("defs", 4);
        qgi qgiVar6 = new qgi("desc", 5);
        a = qgiVar6;
        qgi qgiVar7 = new qgi("ellipse", 6);
        qgi qgiVar8 = new qgi("g", 7);
        qgi qgiVar9 = new qgi("image", 8);
        qgi qgiVar10 = new qgi("line", 9);
        qgi qgiVar11 = new qgi("linearGradient", 10);
        qgi qgiVar12 = new qgi("marker", 11);
        qgi qgiVar13 = new qgi("mask", 12);
        qgi qgiVar14 = new qgi("path", 13);
        qgi qgiVar15 = new qgi("pattern", 14);
        qgi qgiVar16 = new qgi("polygon", 15);
        qgi qgiVar17 = new qgi("polyline", 16);
        qgi qgiVar18 = new qgi("radialGradient", 17);
        qgi qgiVar19 = new qgi("rect", 18);
        qgi qgiVar20 = new qgi("solidColor", 19);
        qgi qgiVar21 = new qgi("stop", 20);
        qgi qgiVar22 = new qgi("style", 21);
        qgi qgiVar23 = new qgi("SWITCH", 22);
        b = qgiVar23;
        qgi qgiVar24 = new qgi("symbol", 23);
        qgi qgiVar25 = new qgi("text", 24);
        qgi qgiVar26 = new qgi("textPath", 25);
        qgi qgiVar27 = new qgi("title", 26);
        c = qgiVar27;
        qgi qgiVar28 = new qgi("tref", 27);
        qgi qgiVar29 = new qgi("tspan", 28);
        qgi qgiVar30 = new qgi("use", 29);
        qgi qgiVar31 = new qgi("view", 30);
        qgi qgiVar32 = new qgi("UNSUPPORTED", 31);
        d = qgiVar32;
        f = new qgi[]{qgiVar, qgiVar2, qgiVar3, qgiVar4, qgiVar5, qgiVar6, qgiVar7, qgiVar8, qgiVar9, qgiVar10, qgiVar11, qgiVar12, qgiVar13, qgiVar14, qgiVar15, qgiVar16, qgiVar17, qgiVar18, qgiVar19, qgiVar20, qgiVar21, qgiVar22, qgiVar23, qgiVar24, qgiVar25, qgiVar26, qgiVar27, qgiVar28, qgiVar29, qgiVar30, qgiVar31, qgiVar32};
        e = new HashMap();
        for (qgi qgiVar33 : values()) {
            if (qgiVar33 == b) {
                e.put("switch", qgiVar33);
            } else if (qgiVar33 != d) {
                e.put(qgiVar33.name(), qgiVar33);
            }
        }
    }

    public static qgi valueOf(String str) {
        return (qgi) Enum.valueOf(qgi.class, str);
    }

    public static qgi[] values() {
        return (qgi[]) f.clone();
    }
}

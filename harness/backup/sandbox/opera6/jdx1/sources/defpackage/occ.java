package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class occ {
    private static final /* synthetic */ g58 $ENTRIES;
    private static final /* synthetic */ occ[] $VALUES;

    @NotNull
    public static final mcc Companion;
    public static final occ ON_ANY;
    public static final occ ON_CREATE;
    public static final occ ON_DESTROY;
    public static final occ ON_PAUSE;
    public static final occ ON_RESUME;
    public static final occ ON_START;
    public static final occ ON_STOP;

    static {
        occ occVar = new occ("ON_CREATE", 0);
        ON_CREATE = occVar;
        occ occVar2 = new occ("ON_START", 1);
        ON_START = occVar2;
        occ occVar3 = new occ("ON_RESUME", 2);
        ON_RESUME = occVar3;
        occ occVar4 = new occ("ON_PAUSE", 3);
        ON_PAUSE = occVar4;
        occ occVar5 = new occ("ON_STOP", 4);
        ON_STOP = occVar5;
        occ occVar6 = new occ("ON_DESTROY", 5);
        ON_DESTROY = occVar6;
        occ occVar7 = new occ("ON_ANY", 6);
        ON_ANY = occVar7;
        occ[] occVarArr = {occVar, occVar2, occVar3, occVar4, occVar5, occVar6, occVar7};
        $VALUES = occVarArr;
        $ENTRIES = new h58(occVarArr);
        Companion = new mcc();
    }

    public static occ valueOf(String str) {
        return (occ) Enum.valueOf(occ.class, str);
    }

    public static occ[] values() {
        return (occ[]) $VALUES.clone();
    }

    public final qcc d() {
        switch (ncc.a[ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                uac.h(this, " has no target state");
                break;
            default:
                h9o.p();
                break;
        }
        return null;
    }
}

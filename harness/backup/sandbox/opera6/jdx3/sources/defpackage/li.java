package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class li extends b6h {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(OperaApplication operaApplication, byte b) {
        super(operaApplication, OperaApplication.class, "vpnManager", "getVpnManager()Lcom/opera/android/vpn/VpnManager;", 0);
        this.b = b;
        switch (b) {
            case 17:
                super(operaApplication, OperaApplication.class, "vpnManager", "getVpnManager()Lcom/opera/android/vpn/VpnManager;", 0);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                super(operaApplication, OperaApplication.class, "premiumAvailability", "getPremiumAvailability()Lcom/opera/android/premium/PremiumAvailability;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    public final Object get() {
        switch (this.b) {
            case 0:
                return ((OperaApplication) ((z84) this).receiver).b();
            case 1:
                return (ech) ((OperaApplication) ((z84) this).receiver).r.p.get();
            case 2:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 3:
                return ((OperaApplication) ((z84) this).receiver).F();
            case 4:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 5:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 6:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 7:
                return (a55) ((OperaApplication) ((z84) this).receiver).r.s.get();
            case 8:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (fg) ((wo3) ((z84) this).receiver).D.getValue();
            case 11:
                return (mv2) ((wo3) ((z84) this).receiver).E.getValue();
            case 12:
                return ((OperaApplication) ((z84) this).receiver).G();
            case 13:
                return ((OperaApplication) ((z84) this).receiver).q();
            case 14:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 15:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 16:
                return ((OperaApplication) ((z84) this).receiver).R();
            case 17:
                return ((OperaApplication) ((z84) this).receiver).R();
            case SizeUtil.textSize0_1 /* 18 */:
                return ((OperaApplication) ((z84) this).receiver).D();
            case 19:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case SizeUtil.textSize0 /* 20 */:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 21:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case SizeUtil.textSize1 /* 22 */:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 23:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case SizeUtil.textSize2 /* 24 */:
                return ((OperaApplication) ((z84) this).receiver).J();
            case 25:
                return ((OperaApplication) ((z84) this).receiver).O();
            case 26:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 27:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 28:
                return ((OperaApplication) ((z84) this).receiver).J();
            default:
                return ((OperaApplication) ((z84) this).receiver).G();
        }
    }
}

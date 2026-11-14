package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class pv3 extends b6h {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv3(OperaApplication operaApplication, byte b) {
        super(operaApplication, OperaApplication.class, "unfilteredUsageReporter", "getUnfilteredUsageReporter()Lcom/opera/android/analytics/UnfilteredUsageReporter;", 0);
        this.b = b;
        switch (b) {
            case 6:
                super(operaApplication, OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0);
                break;
            case 7:
                super(operaApplication, OperaApplication.class, "syncManager", "getSyncManager()Lcom/opera/android/sync/SyncManager;", 0);
                break;
            case 8:
                super(operaApplication, OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                super(operaApplication, OperaApplication.class, "readingListContent", "getReadingListContent()Lcom/opera/android/readlater/ReadingListContent;", 0);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                super(operaApplication, OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0);
                break;
            case 11:
                super(operaApplication, OperaApplication.class, "favoriteManager", "getFavoriteManager()Lcom/opera/android/favorites/FavoriteManager;", 0);
                break;
            case 12:
                super(operaApplication, OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0);
                break;
            case 13:
                super(operaApplication, OperaApplication.class, "pushedContentHandler", "getPushedContentHandler()Lcom/opera/android/PushedContentHandler;", 0);
                break;
            case 14:
                super(operaApplication, OperaApplication.class, "unfilteredUsageReporter", "getUnfilteredUsageReporter()Lcom/opera/android/analytics/UnfilteredUsageReporter;", 0);
                break;
            case 15:
                super(operaApplication, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0);
                break;
            case 16:
                super(operaApplication, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0);
                break;
            case 17:
                super(operaApplication, OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                super(operaApplication, OperaApplication.class, "favoriteManager", "getFavoriteManager()Lcom/opera/android/favorites/FavoriteManager;", 0);
                break;
            case 19:
                super(operaApplication, OperaApplication.class, "defaultBrowserForHttp", "getDefaultBrowserForHttp()Lcom/opera/android/defaultbrowser/DefaultBrowser;", 0);
                break;
            case SizeUtil.textSize0 /* 20 */:
                super(operaApplication, OperaApplication.class, "pushedContentHandler", "getPushedContentHandler()Lcom/opera/android/PushedContentHandler;", 0);
                break;
            case 21:
                super(operaApplication, OperaApplication.class, "continueOnBooking", "getContinueOnBooking()Lcom/opera/android/continue_on_booking/ContinueOnBookingController;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv3(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    public final Object get() {
        switch (this.b) {
            case 0:
                return (qdh) ((OperaApplication) ((z84) this).receiver).r.A0.get();
            case 1:
                return (zzj) ((OperaApplication) ((z84) this).receiver).r.U0.get();
            case 2:
                return ((tw3) ((xv3) ((z84) this).receiver)).a.a();
            case 3:
                return ((OperaApplication) ((z84) this).receiver).N();
            case 4:
                return ((OperaApplication) ((z84) this).receiver).q();
            case 5:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 6:
                return ((OperaApplication) ((z84) this).receiver).b();
            case 7:
                return ((OperaApplication) ((z84) this).receiver).N();
            case 8:
                return ((OperaApplication) ((z84) this).receiver).b();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((OperaApplication) ((z84) this).receiver).H();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return ((OperaApplication) ((z84) this).receiver).b();
            case 11:
                return ((OperaApplication) ((z84) this).receiver).o();
            case 12:
                return ((OperaApplication) ((z84) this).receiver).b();
            case 13:
                return ((OperaApplication) ((z84) this).receiver).F();
            case 14:
                return ((OperaApplication) ((z84) this).receiver).L().d;
            case 15:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 16:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 17:
                return ((OperaApplication) ((z84) this).receiver).b();
            case SizeUtil.textSize0_1 /* 18 */:
                return ((OperaApplication) ((z84) this).receiver).o();
            case 19:
                return ((OperaApplication) ((z84) this).receiver).k();
            case SizeUtil.textSize0 /* 20 */:
                return ((OperaApplication) ((z84) this).receiver).F();
            case 21:
                return ((OperaApplication) ((z84) this).receiver).j();
            case SizeUtil.textSize1 /* 22 */:
                return ((OperaApplication) ((z84) this).receiver).J();
            case 23:
                return ((tw3) ((z84) this).receiver).a.a();
            case SizeUtil.textSize2 /* 24 */:
                return ((OperaApplication) ((z84) this).receiver).x();
            case 25:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 26:
                return ((tw3) ((z84) this).receiver).a.a();
            case 27:
                return ((tw3) ((z84) this).receiver).a.a();
            case 28:
                return ((BrowserActivity) ((z84) this).receiver).G0();
            default:
                return ((OperaApplication) ((z84) this).receiver).L().c;
        }
    }
}

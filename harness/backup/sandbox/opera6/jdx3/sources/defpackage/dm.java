package defpackage;

import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class dm extends Exception {
    public final int a;
    public final int b;

    public dm(int i, int i2, String str) {
        super(str);
        this.b = i;
        this.a = i2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        int i = this.b;
        String str2 = i != 1 ? i != 2 ? "null" : "PLAY" : "LOAD";
        switch (this.a) {
            case 1:
                str = "INTERNAL_ERROR";
                break;
            case 2:
                str = "VAST_MALFORMED_RESPONSE";
                break;
            case 3:
                str = "UNKNOWN_AD_RESPONSE";
                break;
            case 4:
                str = "VAST_TRAFFICKING_ERROR";
                break;
            case 5:
                str = "VAST_LOAD_TIMEOUT";
                break;
            case 6:
                str = "VAST_TOO_MANY_REDIRECTS";
                break;
            case 7:
                str = "VIDEO_PLAY_ERROR";
                break;
            case 8:
                str = "VAST_MEDIA_LOAD_TIMEOUT";
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                str = "VAST_LINEAR_ASSET_MISMATCH";
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                str = "OVERLAY_AD_PLAYING_FAILED";
                break;
            case 11:
                str = "OVERLAY_AD_LOADING_FAILED";
                break;
            case 12:
                str = "VAST_NONLINEAR_ASSET_MISMATCH";
                break;
            case 13:
                str = "COMPANION_AD_LOADING_FAILED";
                break;
            case 14:
                str = "UNKNOWN_ERROR";
                break;
            case 15:
                str = "VAST_EMPTY_RESPONSE";
                break;
            case 16:
                str = "FAILED_TO_REQUEST_ADS";
                break;
            case 17:
                str = "VAST_ASSET_NOT_FOUND";
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                str = "ADS_REQUEST_NETWORK_ERROR";
                break;
            case 19:
                str = "INVALID_ARGUMENTS";
                break;
            case SizeUtil.textSize0 /* 20 */:
                str = "PLAYLIST_NO_CONTENT_TRACKING";
                break;
            case 21:
                str = "UNEXPECTED_ADS_LOADED_EVENT";
                break;
            case SizeUtil.textSize1 /* 22 */:
                str = "ADS_PLAYER_NOT_PROVIDED";
                break;
            default:
                str = "null";
                break;
        }
        return z1m.l(z1m.n("AdError [errorType: ", str2, ", errorCode: ", str, ", message: "), super.getMessage(), "]");
    }
}

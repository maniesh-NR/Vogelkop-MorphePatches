package defpackage;

import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class x1g {
    public final Boolean a;

    public x1g(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof x1g) && this.a.equals(((x1g) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() + (((((1231 * 31) + 1231) * 31) + 1231) * 31)) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1237) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231;
    }

    public final String toString() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("PartialRecordCapabilities(nativeColorTheme=");
        sb.append(bool);
        sb.append(", nativeTopBar=");
        sb.append(bool);
        sb.append(", nativeInputBox=");
        j.e(sb, bool, ", supportsLoginWithGoogle=", this.a, ", supportsMessageAnimationAPI=");
        j.e(sb, bool, ", supportsStartSpeechOutput=", bool, ", supportsImageActions=");
        j.e(sb, bool, ", supportsImageMenuAction=", bool, ", supportsLoginWithContext=");
        j.e(sb, bool, ", supportsLoggedInAccounts=", bool, ", supportsSandboxedAccounts=");
        j.e(sb, bool, ", supportsInputBoxAction=", bool, ", supportsNativeContextMenu=");
        j.e(sb, bool2, ", supportsInputBoxFloat=", bool, ", supportsFileAPI=");
        j.e(sb, bool, ", supportsHideInputBox=", bool, ", supportsOpenSourcesInTabGroup=");
        j.e(sb, bool, ", supportsChatHistory=", bool, ", supportsStartSpeechOutputV2=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}

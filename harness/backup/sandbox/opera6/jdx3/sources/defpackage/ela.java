package defpackage;

import com.appsflyer.internal.o;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ela {
    public final itm a;
    public final x1g b;
    public final e2g c;
    public final vla d;
    public final l8b e;
    public final ila f;
    public final ezj g;

    public ela(itm itmVar, x1g x1gVar, e2g e2gVar, vla vlaVar, l8b l8bVar, ila ilaVar, ezj ezjVar) {
        this.a = itmVar;
        this.b = x1gVar;
        this.c = e2gVar;
        this.d = vlaVar;
        this.e = l8bVar;
        this.f = ilaVar;
        this.g = ezjVar;
    }

    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orb orbVar2 = null;
        itm itmVar = this.a;
        orbVar.s(itmVar != null ? itmVar.a() : null, "user");
        orb orbVar3 = new orb();
        Boolean bool = Boolean.TRUE;
        orbVar3.p(bool, "nativeColorTheme");
        orbVar3.p(bool, "nativeTopBar");
        orbVar3.p(bool, "nativeInputBox");
        orbVar3.p(this.b.a, "supportsLoginWithGoogle");
        orbVar3.p(bool, "supportsMessageAnimationAPI");
        orbVar3.p(bool, "supportsStartSpeechOutput");
        orbVar3.p(bool, "supportsImageActions");
        orbVar3.p(bool, "supportsImageMenuAction");
        orbVar3.p(bool, "supportsLoginWithContext");
        orbVar3.p(bool, "supportsLoggedInAccounts");
        orbVar3.p(bool, "supportsSandboxedAccounts");
        orbVar3.p(bool, "supportsInputBoxAction");
        Boolean bool2 = Boolean.FALSE;
        orbVar3.p(bool2, "supportsNativeContextMenu");
        orbVar3.p(bool, "supportsInputBoxFloat");
        orbVar3.p(bool, "supportsFileAPI");
        orbVar3.p(bool, "supportsHideInputBox");
        orbVar3.p(bool, "supportsOpenSourcesInTabGroup");
        orbVar3.p(bool, "supportsChatHistory");
        orbVar3.p(bool, "supportsStartSpeechOutputV2");
        orbVar.p(orbVar3, "capabilities");
        orb orbVar4 = new orb();
        orbVar4.p(bool2, "sia");
        e2g e2gVar = this.c;
        orbVar4.p(e2gVar.a, "privateMode");
        orbVar4.p(e2gVar.b, "conversationChips");
        orbVar4.p(e2gVar.c, "trackUserGeoData");
        orbVar4.p(e2gVar.d, "trackUserResponse");
        orbVar4.p(e2gVar.e, "initilizeWithSearchChat");
        orbVar4.p(bool, "alwaysShowImageSuggestions");
        orbVar4.p(bool2, "isShowInputBoxGradientEnabled");
        orbVar4.p(bool2, "enableOneAIBackend");
        orbVar4.p(bool2, "enableOneAIRenderer");
        orbVar.p(orbVar4, "settings");
        orb orbVar5 = new orb();
        orbVar5.p(this.d.a, "hasConsentedToAriaTermsAndConditions");
        orbVar.p(orbVar5, "statuses");
        orb orbVar6 = new orb();
        l8b l8bVar = this.e;
        orbVar6.o(l8bVar.a, "height");
        nla nlaVar = l8bVar.b;
        if (nlaVar == nla.UNDEFINED) {
            o.a("Undefined");
            return null;
        }
        orbVar6.p(nlaVar.a, "status");
        mla mlaVar = mla.a;
        orbVar6.p("text", "mode");
        orbVar.s(orbVar6, "inputBoxState");
        orb orbVar7 = new orb();
        kla klaVar = kla.a;
        orbVar7.p("ofa", "product");
        orbVar.s(orbVar7, "host");
        ezj ezjVar = this.g;
        if (ezjVar != null) {
            orbVar2 = new orb();
            tla tlaVar = ezjVar.a;
            orb orbVar8 = new orb();
            orbVar8.s(tlaVar.a, "streamId");
            ula ulaVar = ula.a;
            orbVar8.p("playing", "status");
            orbVar2.p(orbVar8, "activeStream");
        }
        orbVar.s(orbVar2, "speechState");
        return orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ela)) {
            return false;
        }
        ela elaVar = (ela) obj;
        return Intrinsics.a(this.a, elaVar.a) && this.b.equals(elaVar.b) && this.c.equals(elaVar.c) && this.d.equals(elaVar.d) && this.e.equals(elaVar.e) && this.f.equals(elaVar.f) && Intrinsics.a(this.g, elaVar.g);
    }

    public final int hashCode() {
        itm itmVar = this.a;
        int iHashCode = (kla.a.hashCode() + ((this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((itmVar == null ? 0 : itmVar.hashCode()) * 31)) * 31)) * 31)) * 31)) * 961)) * 31;
        ezj ezjVar = this.g;
        return iHashCode + (ezjVar != null ? ezjVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "HostState(user=" + this.a + ", capabilities=" + this.b + ", settings=" + this.c + ", statuses=" + this.d + ", inputBoxState=" + this.e + ", uiInsets=null, host=" + this.f + ", speechState=" + this.g + ")";
    }
}

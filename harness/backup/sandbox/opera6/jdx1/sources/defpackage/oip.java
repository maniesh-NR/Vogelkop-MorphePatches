package defpackage;

import ads_mobile_sdk.c00;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.ov;

/* loaded from: classes.dex */
public final class oip extends ov {
    public static prb q(String str, c00 c00Var) {
        prb prbVar = new prb();
        prbVar.r("bk", str);
        prbVar.r("sk", str);
        prbVar.p(Integer.valueOf(c00Var.a), "type");
        return prbVar;
    }

    public final String r() {
        wpb wpbVar = new wpb();
        c00 c00Var = c00.STRING;
        prb prbVar = new prb();
        prbVar.r("consent_key", "gad_has_consent_for_cookies");
        prbVar.r("consent_value_match", "0");
        prbVar.p(1, "consent_value_type");
        wpbVar.o(prbVar);
        prb prbVar2 = new prb();
        prbVar2.r("consent_key", "IABTCF_gdprApplies");
        prbVar2.r("consent_value_match", "1");
        prbVar2.p(1, "consent_value_type");
        wpbVar.o(prbVar2);
        return (String) a("gads:full_consent_check_map", wpbVar.toString(), fo.a$23);
    }

    public final String s() {
        wpb wpbVar = new wpb();
        c00 c00Var = c00.STRING;
        wpbVar.o(q("IABTCF_AddtlConsent", c00Var));
        wpbVar.o(q("IABConsent_CMPPresent", c00.BOOLEAN));
        c00 c00Var2 = c00.NUMBER;
        wpbVar.o(q("IABTCF_CmpSdkID", c00Var2));
        wpbVar.o(q("IABConsent_ConsentString", c00Var));
        wpbVar.o(q("IABTCF_gdprApplies", c00Var2));
        wpbVar.o(q("IABGPP_HDR_GppString", c00Var));
        wpbVar.o(q("IABGPP_GppSID", c00Var));
        wpbVar.o(q("gad_has_consent_for_cookies", c00Var2));
        wpbVar.o(q("IABConsent_ParsedPurposeConsents", c00Var));
        wpbVar.o(q("personalized_ad_status", c00Var));
        wpbVar.o(q("IABTCF_PolicyVersion", c00Var2));
        wpbVar.o(q("IABUSPrivacy_String", c00Var));
        wpbVar.o(q("IABTCF_PurposeConsents", c00Var));
        wpbVar.o(q("gad_rdp", c00Var2));
        wpbVar.o(q("IABConsent_SubjectToGDPR", c00Var));
        wpbVar.o(q("IABTCF_TCString", c00Var));
        wpbVar.o(q("IABConsent_ParsedVendorConsents", c00Var));
        wpbVar.o(q("UMP_eids", c00Var));
        return (String) a("gads:sp:json_string", wpbVar.toString(), fo.a$23);
    }
}

package com.opera.android.crashhandler;

import J.N;
import androidx.annotation.NonNull;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import defpackage.aik;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class OperaCrashKeys {
    public static final String[] c = {"Android_App_Abi", "Android_OS_Version", "Android_Package_Name", "BuildID", "InstallTime", "OperaReleaseChannel", "ProcessType", "ProductName", "ProductId", "StartupTime", "Version", "Version_Name", "mapping-package", "symbols-package", "UBN", "BreamBuildFolder", "ProguardMappingsId", "UseProguardMappingsId", "AB_Group", "AdapterDeviceID", "AdapterVendorID", "Android_CPU_ABI", "Android_Manufacturer", "Android_Model", "Android_Version", "Apk_Install_Time", "Apk_Update_Time", "Config_Bundle", "Default_Branding", "Distribution_Source", "Distribution_Medium", "Dpi", "Emulated_Modules", "Host_Platform", "Install_Referrer", "Installation_ID", "Installed_Modules", "Java_Heap_Limit", "Lifecyle_Status", "Locales", "Mini_Server_Host", "Power_Save_Mode", "Premium_State", "Previous_Version_Code", "Session_Db_Init_Result", MessageTemplateConstants.Args.URL, "User_Agent", "Version_Code", "WebView_Package", "WebView_Version"};
    public final AtomicReferenceArray a = new AtomicReferenceArray(50);
    public boolean b;

    @NonNull
    public static String makeUrlFitForFeedbackOrStats(@NonNull String str) {
        String[] strArr = aik.a;
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return aik.p(str);
    }

    public final void a(int i, String str) {
        this.a.set(i, str);
        if (this.b) {
            N.MDEEK5$i(i, str);
        }
    }
}

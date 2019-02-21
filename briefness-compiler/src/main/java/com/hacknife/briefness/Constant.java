package com.hacknife.briefness;

/**
 * author  : hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : Briefness
 */
public class Constant {
    public static final String METHOD = "METHOD";
    public static final String PROTECT = "PROTECT";
    public static final String debug = "debug";
    public static final String release = "release";
    public static final String source = "source";
    public static final String build = "build";
    public static final String r = "r";
    public static final String apt = "apt";
    public static final String tpa = "tpa";
    public static final String empty = "";
    public static final String fileR = "R.java";
    public static final String dot = ".";
    public static final String separator = "/";
    public static final String briefnessInjector = "BriefnessInjector";


    public static final String javaPath = "%s/src/main/java/%s/%s.java";


    public static final String iPackage = "--iPackage--";
    public static final String proxy = "--proxy--";
    public static final String packages = "--package--";
    public static final String iView = "--iView--";
    public static final String iJavabean = "--iJavabean--";
    public static final String className = "--className--";
    public static final String javabean = "--javabean--";
    public static final String view = "--view--";
    public static final String setContentView = "--setContentView--";
    public static final String findView = "--findView--";
    public static final String transfer = "--transfer--";

    public static final String clear = "--clear--";
    public static final String clearAll = "--clearAll--";
    public static final String set = "--set--";
    public static final String viewModel = "--viewModel--";
    public static final String notify = "--notify--";
    public static final String iimport = "--iimport--";

    public static final String briefnessor = "// Generated by BriefnessProcessor (https://github.com/hacknife/Briefness).\n" +
            "// If you have any questions in use, please use email to contact me (e-mail:4884280@qq.com).\n" +
            "package --iPackage--;\n" +
            "import java.util.ArrayList;\n" +
            "import android.app.Activity;\n" +
            "import android.view.View;\n" +
            "import --iPackage--.--className--;\n" +
            "import com.hacknife.briefness.B;\n" +
            "import com.hacknife.briefness.LiveData;\n" +
            "import android.view.LayoutInflater;\n" +
            "--iimport--" +
            "import --package--.R;\n" +
            "--iView--" +
            "--iJavabean--" +
            "import com.hacknife.briefness.Utils;\n" +
            "import --package--.BriefnessInjector;\n" +
            "\n" +
            "public class --proxy-- extends B<--className--> {\n" +
            "--view--" +
            "--javabean--" +
            "\n" +
            "    @Override\n" +
            "    public void bind(final --className-- target, Object obj) {\n" +
            "        super.bind(target,obj);\n" +
            "--setContentView--" +
            "--findView--" +
            "--transfer--" +
            "\n" +
            "    }\n" +
            "\n" +
            "--clear--" +
            "\n" +
            "--clearAll--" +
            "--viewModel--" +
            "\n" +
            "--set--" +
            "\n" +
            "--notify--" +
            "}\n";

}

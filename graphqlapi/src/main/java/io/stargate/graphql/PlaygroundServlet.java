package io.stargate.graphql;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PlaygroundServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException
    {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        // From https://raw.githubusercontent.com/prisma-labs/graphql-playground/master/packages/graphql-playground-html/withAnimation.html
        response.getWriter().println("<!DOCTYPE html>\n" +
                "\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "  <meta charset=utf-8 />\n" +
                "  <meta name=\"viewport\" content=\"user-scalable=no, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, minimal-ui\">\n" +
                "  <title>GraphQL Playground</title>\n" +
                "  <link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/graphql-playground-react/build/static/css/index.css\" />\n" +
                "  <link rel=\"shortcut icon\" href=\"//cdn.jsdelivr.net/npm/graphql-playground-react/build/favicon.png\" />\n" +
                "  <script src=\"//cdn.jsdelivr.net/npm/graphql-playground-react/build/static/js/middleware.js\"></script>\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "  <style type=\"text/css\">\n" +
                "    html {\n" +
                "      font-family: \"Open Sans\", sans-serif;\n" +
                "      overflow: hidden;\n" +
                "    }\n" +
                "\n" +
                "    body {\n" +
                "      margin: 0;\n" +
                "      background: #172a3a;\n" +
                "    }\n" +
                "\n" +
                "    .playgroundIn {\n" +
                "      -webkit-animation: playgroundIn 0.5s ease-out forwards;\n" +
                "      animation: playgroundIn 0.5s ease-out forwards;\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes playgroundIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(10px);\n" +
                "        -ms-transform: translateY(10px);\n" +
                "        transform: translateY(10px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes playgroundIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(10px);\n" +
                "        -ms-transform: translateY(10px);\n" +
                "        transform: translateY(10px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "  </style>\n" +
                "\n" +
                "  <style type=\"text/css\">\n" +
                "    .fadeOut {\n" +
                "      -webkit-animation: fadeOut 0.5s ease-out forwards;\n" +
                "      animation: fadeOut 0.5s ease-out forwards;\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes fadeIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(-10px);\n" +
                "        -ms-transform: translateY(-10px);\n" +
                "        transform: translateY(-10px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes fadeIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(-10px);\n" +
                "        -ms-transform: translateY(-10px);\n" +
                "        transform: translateY(-10px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes fadeOut {\n" +
                "      from {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(-10px);\n" +
                "        -ms-transform: translateY(-10px);\n" +
                "        transform: translateY(-10px);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes fadeOut {\n" +
                "      from {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(-10px);\n" +
                "        -ms-transform: translateY(-10px);\n" +
                "        transform: translateY(-10px);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes appearIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(0px);\n" +
                "        -ms-transform: translateY(0px);\n" +
                "        transform: translateY(0px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes appearIn {\n" +
                "      from {\n" +
                "        opacity: 0;\n" +
                "        -webkit-transform: translateY(0px);\n" +
                "        -ms-transform: translateY(0px);\n" +
                "        transform: translateY(0px);\n" +
                "      }\n" +
                "      to {\n" +
                "        opacity: 1;\n" +
                "        -webkit-transform: translateY(0);\n" +
                "        -ms-transform: translateY(0);\n" +
                "        transform: translateY(0);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes scaleIn {\n" +
                "      from {\n" +
                "        -webkit-transform: scale(0);\n" +
                "        -ms-transform: scale(0);\n" +
                "        transform: scale(0);\n" +
                "      }\n" +
                "      to {\n" +
                "        -webkit-transform: scale(1);\n" +
                "        -ms-transform: scale(1);\n" +
                "        transform: scale(1);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes scaleIn {\n" +
                "      from {\n" +
                "        -webkit-transform: scale(0);\n" +
                "        -ms-transform: scale(0);\n" +
                "        transform: scale(0);\n" +
                "      }\n" +
                "      to {\n" +
                "        -webkit-transform: scale(1);\n" +
                "        -ms-transform: scale(1);\n" +
                "        transform: scale(1);\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes innerDrawIn {\n" +
                "      0% {\n" +
                "        stroke-dashoffset: 70;\n" +
                "      }\n" +
                "      50% {\n" +
                "        stroke-dashoffset: 140;\n" +
                "      }\n" +
                "      100% {\n" +
                "        stroke-dashoffset: 210;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes innerDrawIn {\n" +
                "      0% {\n" +
                "        stroke-dashoffset: 70;\n" +
                "      }\n" +
                "      50% {\n" +
                "        stroke-dashoffset: 140;\n" +
                "      }\n" +
                "      100% {\n" +
                "        stroke-dashoffset: 210;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @-webkit-keyframes outerDrawIn {\n" +
                "      0% {\n" +
                "        stroke-dashoffset: 76;\n" +
                "      }\n" +
                "      100% {\n" +
                "        stroke-dashoffset: 152;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    @keyframes outerDrawIn {\n" +
                "      0% {\n" +
                "        stroke-dashoffset: 76;\n" +
                "      }\n" +
                "      100% {\n" +
                "        stroke-dashoffset: 152;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    .hHWjkv {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.2222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.2222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .gCDOzd {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.4222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.4222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .hmCcxi {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.6222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.6222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .eHamQi {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.8222222222222223s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.8222222222222223s;\n" +
                "    }\n" +
                "\n" +
                "    .byhgGu {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 1.0222222222222221s;\n" +
                "      animation: scaleIn 0.25s linear forwards 1.0222222222222221s;\n" +
                "    }\n" +
                "\n" +
                "    .llAKP {\n" +
                "      -webkit-transform-origin: 0px 0px;\n" +
                "      -ms-transform-origin: 0px 0px;\n" +
                "      transform-origin: 0px 0px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 1.2222222222222223s;\n" +
                "      animation: scaleIn 0.25s linear forwards 1.2222222222222223s;\n" +
                "    }\n" +
                "\n" +
                "    .bglIGM {\n" +
                "      -webkit-transform-origin: 64px 28px;\n" +
                "      -ms-transform-origin: 64px 28px;\n" +
                "      transform-origin: 64px 28px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.2222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.2222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .ksxRII {\n" +
                "      -webkit-transform-origin: 95.98500061035156px 46.510000228881836px;\n" +
                "      -ms-transform-origin: 95.98500061035156px 46.510000228881836px;\n" +
                "      transform-origin: 95.98500061035156px 46.510000228881836px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.4222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.4222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .cWrBmb {\n" +
                "      -webkit-transform-origin: 95.97162628173828px 83.4900016784668px;\n" +
                "      -ms-transform-origin: 95.97162628173828px 83.4900016784668px;\n" +
                "      transform-origin: 95.97162628173828px 83.4900016784668px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.6222222222222222s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.6222222222222222s;\n" +
                "    }\n" +
                "\n" +
                "    .Wnusb {\n" +
                "      -webkit-transform-origin: 64px 101.97999572753906px;\n" +
                "      -ms-transform-origin: 64px 101.97999572753906px;\n" +
                "      transform-origin: 64px 101.97999572753906px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 0.8222222222222223s;\n" +
                "      animation: scaleIn 0.25s linear forwards 0.8222222222222223s;\n" +
                "    }\n" +
                "\n" +
                "    .bfPqf {\n" +
                "      -webkit-transform-origin: 32.03982162475586px 83.4900016784668px;\n" +
                "      -ms-transform-origin: 32.03982162475586px 83.4900016784668px;\n" +
                "      transform-origin: 32.03982162475586px 83.4900016784668px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 1.0222222222222221s;\n" +
                "      animation: scaleIn 0.25s linear forwards 1.0222222222222221s;\n" +
                "    }\n" +
                "\n" +
                "    .edRCTN {\n" +
                "      -webkit-transform-origin: 32.033552169799805px 46.510000228881836px;\n" +
                "      -ms-transform-origin: 32.033552169799805px 46.510000228881836px;\n" +
                "      transform-origin: 32.033552169799805px 46.510000228881836px;\n" +
                "      -webkit-transform: scale(0);\n" +
                "      -ms-transform: scale(0);\n" +
                "      transform: scale(0);\n" +
                "      -webkit-animation: scaleIn 0.25s linear forwards 1.2222222222222223s;\n" +
                "      animation: scaleIn 0.25s linear forwards 1.2222222222222223s;\n" +
                "    }\n" +
                "\n" +
                "    .iEGVWn {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 0.3333333333333333s, appearIn 0.1s ease-out forwards 0.3333333333333333s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 0.3333333333333333s, appearIn 0.1s ease-out forwards 0.3333333333333333s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .bsocdx {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 0.5333333333333333s, appearIn 0.1s ease-out forwards 0.5333333333333333s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 0.5333333333333333s, appearIn 0.1s ease-out forwards 0.5333333333333333s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .jAZXmP {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 0.7333333333333334s, appearIn 0.1s ease-out forwards 0.7333333333333334s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 0.7333333333333334s, appearIn 0.1s ease-out forwards 0.7333333333333334s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .hSeArx {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 0.9333333333333333s, appearIn 0.1s ease-out forwards 0.9333333333333333s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 0.9333333333333333s, appearIn 0.1s ease-out forwards 0.9333333333333333s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .bVgqGk {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 1.1333333333333333s, appearIn 0.1s ease-out forwards 1.1333333333333333s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 1.1333333333333333s, appearIn 0.1s ease-out forwards 1.1333333333333333s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .hEFqBt {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 76;\n" +
                "      -webkit-animation: outerDrawIn 0.5s ease-out forwards 1.3333333333333333s, appearIn 0.1s ease-out forwards 1.3333333333333333s;\n" +
                "      animation: outerDrawIn 0.5s ease-out forwards 1.3333333333333333s, appearIn 0.1s ease-out forwards 1.3333333333333333s;\n" +
                "      -webkit-animation-iteration-count: 1, 1;\n" +
                "      animation-iteration-count: 1, 1;\n" +
                "    }\n" +
                "\n" +
                "    .dzEKCM {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 70;\n" +
                "      -webkit-animation: innerDrawIn 1s ease-in-out forwards 1.3666666666666667s, appearIn 0.1s linear forwards 1.3666666666666667s;\n" +
                "      animation: innerDrawIn 1s ease-in-out forwards 1.3666666666666667s, appearIn 0.1s linear forwards 1.3666666666666667s;\n" +
                "      -webkit-animation-iteration-count: infinite, 1;\n" +
                "      animation-iteration-count: infinite, 1;\n" +
                "    }\n" +
                "\n" +
                "    .DYnPx {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 70;\n" +
                "      -webkit-animation: innerDrawIn 1s ease-in-out forwards 1.5333333333333332s, appearIn 0.1s linear forwards 1.5333333333333332s;\n" +
                "      animation: innerDrawIn 1s ease-in-out forwards 1.5333333333333332s, appearIn 0.1s linear forwards 1.5333333333333332s;\n" +
                "      -webkit-animation-iteration-count: infinite, 1;\n" +
                "      animation-iteration-count: infinite, 1;\n" +
                "    }\n" +
                "\n" +
                "    .hjPEAQ {\n" +
                "      opacity: 0;\n" +
                "      stroke-dasharray: 70;\n" +
                "      -webkit-animation: innerDrawIn 1s ease-in-out forwards 1.7000000000000002s, appearIn 0.1s linear forwards 1.7000000000000002s;\n" +
                "      animation: innerDrawIn 1s ease-in-out forwards 1.7000000000000002s, appearIn 0.1s linear forwards 1.7000000000000002s;\n" +
                "      -webkit-animation-iteration-count: infinite, 1;\n" +
                "      animation-iteration-count: infinite, 1;\n" +
                "    }\n" +
                "\n" +
                "    #loading-wrapper {\n" +
                "      position: absolute;\n" +
                "      width: 100vw;\n" +
                "      height: 100vh;\n" +
                "      display: -webkit-box;\n" +
                "      display: -webkit-flex;\n" +
                "      display: -ms-flexbox;\n" +
                "      display: flex;\n" +
                "      -webkit-align-items: center;\n" +
                "      -webkit-box-align: center;\n" +
                "      -ms-flex-align: center;\n" +
                "      align-items: center;\n" +
                "      -webkit-box-pack: center;\n" +
                "      -webkit-justify-content: center;\n" +
                "      -ms-flex-pack: center;\n" +
                "      justify-content: center;\n" +
                "      -webkit-flex-direction: column;\n" +
                "      -ms-flex-direction: column;\n" +
                "      flex-direction: column;\n" +
                "    }\n" +
                "\n" +
                "    .logo {\n" +
                "      width: 75px;\n" +
                "      height: 75px;\n" +
                "      margin-bottom: 20px;\n" +
                "      opacity: 0;\n" +
                "      -webkit-animation: fadeIn 0.5s ease-out forwards;\n" +
                "      animation: fadeIn 0.5s ease-out forwards;\n" +
                "    }\n" +
                "\n" +
                "    .text {\n" +
                "      font-size: 32px;\n" +
                "      font-weight: 200;\n" +
                "      text-align: center;\n" +
                "      color: rgba(255, 255, 255, 0.6);\n" +
                "      opacity: 0;\n" +
                "      -webkit-animation: fadeIn 0.5s ease-out forwards;\n" +
                "      animation: fadeIn 0.5s ease-out forwards;\n" +
                "    }\n" +
                "\n" +
                "    .dGfHfc {\n" +
                "      font-weight: 400;\n" +
                "    }\n" +
                "  </style>\n" +
                "  <div id=\"loading-wrapper\">\n" +
                "    <svg class=\"logo\" viewBox=\"0 0 128 128\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
                "      <title>GraphQL Playground Logo</title>\n" +
                "      <defs>\n" +
                "        <linearGradient id=\"linearGradient-1\" x1=\"4.86%\" x2=\"96.21%\" y1=\"0%\" y2=\"99.66%\">\n" +
                "          <stop stop-color=\"#E00082\" stop-opacity=\".8\" offset=\"0%\"></stop>\n" +
                "          <stop stop-color=\"#E00082\" offset=\"100%\"></stop>\n" +
                "        </linearGradient>\n" +
                "      </defs>\n" +
                "      <g>\n" +
                "        <rect id=\"Gradient\" width=\"127.96\" height=\"127.96\" y=\"1\" fill=\"url(#linearGradient-1)\" rx=\"4\"></rect>\n" +
                "        <path id=\"Border\" fill=\"#E00082\" fill-rule=\"nonzero\" d=\"M4.7 2.84c-1.58 0-2.86 1.28-2.86 2.85v116.57c0 1.57 1.28 2.84 2.85 2.84h116.57c1.57 0 2.84-1.26 2.84-2.83V5.67c0-1.55-1.26-2.83-2.83-2.83H4.67zM4.7 0h116.58c3.14 0 5.68 2.55 5.68 5.7v116.58c0 3.14-2.54 5.68-5.68 5.68H4.68c-3.13 0-5.68-2.54-5.68-5.68V5.68C-1 2.56 1.55 0 4.7 0z\"></path>\n" +
                "        <path class=\"bglIGM\" x=\"64\" y=\"28\" fill=\"#fff\" d=\"M64 36c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8\" style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"ksxRII\" x=\"95.98500061035156\" y=\"46.510000228881836\" fill=\"#fff\" d=\"M89.04 50.52c-2.2-3.84-.9-8.73 2.94-10.96 3.83-2.2 8.72-.9 10.95 2.94 2.2 3.84.9 8.73-2.94 10.96-3.85 2.2-8.76.9-10.97-2.94\"\n" +
                "          style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"cWrBmb\" x=\"95.97162628173828\" y=\"83.4900016784668\" fill=\"#fff\" d=\"M102.9 87.5c-2.2 3.84-7.1 5.15-10.94 2.94-3.84-2.2-5.14-7.12-2.94-10.96 2.2-3.84 7.12-5.15 10.95-2.94 3.86 2.23 5.16 7.12 2.94 10.96\"\n" +
                "          style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"Wnusb\" x=\"64\" y=\"101.97999572753906\" fill=\"#fff\" d=\"M64 110c-4.43 0-8-3.6-8-8.02 0-4.44 3.57-8.02 8-8.02s8 3.58 8 8.02c0 4.4-3.57 8.02-8 8.02\"\n" +
                "          style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"bfPqf\" x=\"32.03982162475586\" y=\"83.4900016784668\" fill=\"#fff\" d=\"M25.1 87.5c-2.2-3.84-.9-8.73 2.93-10.96 3.83-2.2 8.72-.9 10.95 2.94 2.2 3.84.9 8.73-2.94 10.96-3.85 2.2-8.74.9-10.95-2.94\"\n" +
                "          style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"edRCTN\" x=\"32.033552169799805\" y=\"46.510000228881836\" fill=\"#fff\" d=\"M38.96 50.52c-2.2 3.84-7.12 5.15-10.95 2.94-3.82-2.2-5.12-7.12-2.92-10.96 2.2-3.84 7.12-5.15 10.95-2.94 3.83 2.23 5.14 7.12 2.94 10.96\"\n" +
                "          style=\"transform: translate(100px, 100px);\"></path>\n" +
                "        <path class=\"iEGVWn\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M63.55 27.5l32.9 19-32.9-19z\"></path>\n" +
                "        <path class=\"bsocdx\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M96 46v38-38z\"></path>\n" +
                "        <path class=\"jAZXmP\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M96.45 84.5l-32.9 19 32.9-19z\"></path>\n" +
                "        <path class=\"hSeArx\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M64.45 103.5l-32.9-19 32.9 19z\"></path>\n" +
                "        <path class=\"bVgqGk\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M32 84V46v38z\"></path>\n" +
                "        <path class=\"hEFqBt\" stroke=\"#fff\" stroke-width=\"4\" stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M31.55 46.5l32.9-19-32.9 19z\"></path>\n" +
                "        <path class=\"dzEKCM\" id=\"Triangle-Bottom\" stroke=\"#fff\" stroke-width=\"4\" d=\"M30 84h70\" stroke-linecap=\"round\"></path>\n" +
                "        <path class=\"DYnPx\" id=\"Triangle-Left\" stroke=\"#fff\" stroke-width=\"4\" d=\"M65 26L30 87\" stroke-linecap=\"round\"></path>\n" +
                "        <path class=\"hjPEAQ\" id=\"Triangle-Right\" stroke=\"#fff\" stroke-width=\"4\" d=\"M98 87L63 26\" stroke-linecap=\"round\"></path>\n" +
                "      </g>\n" +
                "    </svg>\n" +
                "    <div class=\"text\">Loading\n" +
                "      <span class=\"dGfHfc\">GraphQL Playground</span>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  <div id=\"root\" />\n" +
                "  <script type=\"text/javascript\">\n" +
                "    window.addEventListener('load', function (event) {\n" +
                "\n" +
                "      const loadingWrapper = document.getElementById('loading-wrapper');\n" +
                "      loadingWrapper.classList.add('fadeOut');\n" +
                "\n" +
                "\n" +
                "      const root = document.getElementById('root');\n" +
                "      root.classList.add('playgroundIn');\n" +
                "\n" +
                "      GraphQLPlayground.init(root, {\n" +
                "        // you can add more options here\n" +
                "      })\n" +
                "    })\n" +
                "  </script>\n" +
                "</body>\n" +
                "</html>");
    }
}

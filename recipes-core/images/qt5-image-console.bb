SUMMARY = "A basic Qt5 qwidgets dev image"
# HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require custom-image.bb

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
"

QT_TOOLS = " \
    qtbase \
    qtserialport \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

IMAGE_INSTALL += " \
    ${QT_DEV_TOOLS} \
    ${FONTS} \
    ${QT_TOOLS} \
"

export IMAGE_BASENAME = "qt5-image-console"

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

#IMAGE_FEATURES += "dev-pkgs"

IMAGE_FEATURES += "ssh-server-openssh"

# necessario para dar run do qt
IMAGE_INSTALL_append += " openssh-sftp-server"

#IMAGE_INSTALL_append += " psplash"

#remove rainbow rpi
#DISABLE_SPLASH = "1"
#RPI_USE_U_BOOT = "1"

#APPEND += "quiet"

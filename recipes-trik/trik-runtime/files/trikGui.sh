#!/bin/sh
. /etc/profile.d/locale.sh
. /etc/profile.d/qws_display.sh
. /etc/profile.d/trik_runtime_path.sh
. /etc/profile.d/python_path.sh

cd /home/root/trik && exec ./trikGui 2>&1 1> /dev/null

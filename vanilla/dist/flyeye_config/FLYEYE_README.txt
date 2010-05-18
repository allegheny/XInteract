
FlyEye 1.0 (for use with XInteract student interface)
========================================

This system uses VNC to view the desktops of students who are currently running
the XInteract student-side problem solving interface. When launched, this 
program runs a Java application that displays a Swing panel containing 
thumbnails of each student's desktop. Clicking on any one of those thumbnails 
causes a full-screen version of that desktop to pop up. 

To run the program, type "java flyEye.flyEyeViewer config-file" into a terminal
from this directory, where "config-file" is a path to the file that contains 
the configuration files containing the hostnames of the machines to be 
displayed by the thumbnailer. These configuration files are simply plaintext, 
tab-delimited datafiles which contain the hostnames in the same format in which
the desktops will appear onscreen when the program is launched. 

Config files for the 101 (flyeye_config/hostnames_alden101.txt), 103 
(flyeye_config/hostnames_alden103.txt), and 109 
(flyeye_config/hostnames_alden109.txt) labs come with the system, although 
these may need to be altered as new computers are added or removed. These files
are written from the perspective of the instructor's station (except in the 
case of 103, which is written from the perspective of the interior wall 
opposite the windows). In other words, the instructor's station is located at 
the bottom of the file.

Each line in the configuration files should have the same number of entries. In
the case of absent computers or an odd, non-rectangular layout of the room (ie,
103) simply use a dot (.) to designate that there is no computer at a 
particular location. Configuration files should end with a newline.

Currently, the instructor must close and relaunch FlyEye every time a new 
student machine launches the XInteract student client. Also, if a student 
closes his/her XInteract while the FlyEye thumbnailer is running, that 
student's desktop thumbnail will simply freeze on the instructor's display. 
Future versions will deal with new and dropped connections in a more 
intelligent manner.

FlyEye may not function correctly if a student has multiple instances of the 
XInteract student client running, if there are VNC servers running other than 
the servers launched by XInteract, or if a former instance of the XInteract 
student interface is not shut down correctly. Future versions of this program 
will attempt to deal with such problems more gracefully, but if this program 
hangs after connecting to a VNC server on one of the lab machines, first kill 
this program and identify the machine using the hostname as printed on the 
console and the configuration file. Next, on the offending machine, kill all 
instances of XInteract and x11vnc. Use "ps -ef | grep x11vnc" and "ps -ef | 
grep XInteract" to locate all processes that need to be terminated. Finally, 
have the student relaunch XInteract on his or her machine, and then relaunch 
FlyEye on your machine. Hopefully everything will now work.

To recompile this system from source, no external libraries should be 
necessary, although all classes from the flyEye, vncviewer, rfb, and rdr 
packages must be present.

This software incorporates the RealVNC Java VNC viewer. Since that system is 
licensed under the GNU General Public License, so also is this system. A copy 
of this license is included with the system.


#!/bin/bash

# Default values for arguments
arg1=""
arg2=""
arg3=""
arg4=""
arg5=""
arg6=""
arg7=""
arg8=""

# Specify the relative path to your custom JRE
RELATIVE_JRE_PATH="jre"

# Construct the absolute path to your custom JRE
JAVA_HOME="$(cd "$(dirname "$0")" && pwd)/$RELATIVE_JRE_PATH"

# Parse command-line arguments
while [[ $# -gt 0 ]]; do
    case "$1" in
        -p)
            arg1="$2"
            shift 2
            ;;
        -b)
            arg2="$2"
            shift 2
            ;;
        -i)
            arg3="$2"
            shift 2
            ;;
        -t)
            arg4="$2"
            shift 2
            ;;
        -f)
            arg5="$2"
            shift 2
            ;;
        -c)
            arg6="$2"
            shift 2
            ;;
        -d)
            arg7="$2"
            shift 2
            ;;
        -o)
            arg8="$2"
            shift 2
            ;;
        *)
            echo "Invalid argument: $1"
            exit 1
            ;;
    esac
done

# Check for missing parameters
if [ -z "$arg1" ] || [ -z "$arg2" ] || [ -z "$arg3" ] || [ -z "$arg4" ] || [ -z "$arg5" ] || [ -z "$arg6" ] || [ -z "$arg7" ] || [ -z "$arg8" ]; then
    echo "Usage: $0 -p <arg1> -b <arg2> -i <arg3> -t <arg4> -f <arg5> -c <arg6> -d <arg7> -o <arg8>"
    exit 1
fi

# Change directory to the location of the script
cd "$(dirname "$0")"

# Execute the JAR file with the provided command-line arguments using your custom JRE
"$JAVA_HOME"/bin/java -jar bin/junitupload.jar \
-p "$arg1" \
-b "$arg2" \
-i "$arg3" \
-t "$arg4" \
-f "$arg5" \
-c "$arg6" \
-d "$arg7" \
-o "$arg8"

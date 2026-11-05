#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "Usage: $0 <name> <email>"
    exit 1
fi

git config --global user.name "$1"
git config --global user.email "$2"

echo "Git global configuration updated:"
echo "Name:  $(git config --global user.name)"
echo "Email: $(git config --global user.email)"

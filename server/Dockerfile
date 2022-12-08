FROM --platform=arm64 node:16

WORKDIR /app

COPY package*.json .

RUN npm ci

COPY server.js .

EXPOSE 1337
CMD [ "node", "server.js" ]
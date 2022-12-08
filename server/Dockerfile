FROM node:16

WORKDIR /app

COPY package*.json ./

RUN npm ci

COPY server.js workshop.proto ./

EXPOSE 1337
CMD [ "node", "server.js" ]
